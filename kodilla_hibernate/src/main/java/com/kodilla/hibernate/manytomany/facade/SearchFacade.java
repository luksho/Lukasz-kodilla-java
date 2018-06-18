package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public int softwareMachineId;
    public int dataMaestersId;
    public int greyMatterId;

    public static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);


    public void prepareData() throws SearchingExeption {
        LOGGER.info("Preparing data...");
        try {
            createCompaniesAndEmployees();
            LOGGER.info("Data created");
        } catch (SearchingExeption e) {
            throw new SearchingExeption(SearchingExeption.DATABASE_ERROR);
        }
    }

    public void createCompaniesAndEmployees() throws SearchingExeption {
        LOGGER.info("Creating employees...");
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        LOGGER.info("Employees created...");

        LOGGER.info("Creating companies...");
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        LOGGER.info("Companies created...");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        greyMatterId = greyMatter.getId();
    }

    public List<Company> findCompany(String word) throws SearchingExeption {
        LOGGER.info("Searching companies started...");
        List<Company> retrieveCompany = companyDao.retrieveCompanyByFirstThreeLetters(word);
        for (Company company : retrieveCompany) {
            LOGGER.info("Companies found: " + company.getName());
        }
        if (retrieveCompany.isEmpty()) {
            LOGGER.info("Company not found");
            throw new SearchingExeption(SearchingExeption.COMPANY_NOT_FOUND);
        }
        return retrieveCompany;
    }

    public List<Employee> findEmployee(String word) throws SearchingExeption {
        LOGGER.info("Searching employee started...");
        List<Employee> retrieveEmployee = employeeDao.retrieveEmployeeByLastName(word);
        for (Employee employee : retrieveEmployee) {
            LOGGER.info("Employee found: " + employee.getFirstname() + " " + employee.getLastname());
        }
        if (retrieveEmployee.isEmpty()) {
            LOGGER.info("Employee not found");
            throw new SearchingExeption(SearchingExeption.EMPLOYEE_NOT_FOUND);
        }
        return retrieveEmployee;
    }
}
