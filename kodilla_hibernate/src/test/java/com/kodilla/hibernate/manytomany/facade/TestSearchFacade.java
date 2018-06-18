package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSearchFacade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    SearchFacade searchFacade;


    @Test
    public void shouldGetCompanies() {
        //Given
        try {
            searchFacade.prepareData();
        } catch (SearchingExeption e) {
            System.out.println(e);
        }
        //When
        try {
            List<Company> companies = searchFacade.findCompany("ma");

        //Then
            Assert.assertEquals(3, companies.size());
        } catch (SearchingExeption e) {
            System.out.println(e);
        }
        //Clean
        try {
            companyDao.delete(searchFacade.softwareMachineId);
            companyDao.delete(searchFacade.dataMaestersId);
            companyDao.delete(searchFacade.greyMatterId);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    @Test
    public void shouldGetEmployees() {
        //Given
        try {
            searchFacade.prepareData();
        } catch (SearchingExeption e) {
            System.out.println(e);
        }
        //When
        try {
            List<Employee> employees = searchFacade.findEmployee("Kov");

        //Then
            Assert.assertEquals(1, employees.size());
        } catch (SearchingExeption e) {
            System.out.println(e);
        }

        //Clean
        try {
            companyDao.delete(searchFacade.softwareMachineId);
            companyDao.delete(searchFacade.dataMaestersId);
            companyDao.delete(searchFacade.greyMatterId);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
