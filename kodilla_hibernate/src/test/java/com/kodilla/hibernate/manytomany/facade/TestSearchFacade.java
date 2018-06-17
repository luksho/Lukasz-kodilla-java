package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
    public void testSearchingFacade() {
        try {
            searchFacade.prepareData();
        } catch (SearchingExeption e) {
            System.out.println(e);
        }
        try {
            searchFacade.findCompany("ma");
        } catch (SearchingExeption e) {
            System.out.println(e);
        }
        try {
            searchFacade.findEmployee("Kov");
        } catch (SearchingExeption e) {
            System.out.println(e);
        }
    }
}
