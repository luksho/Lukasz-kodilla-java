package com.kodilla.hibernate.manytomany.facade;

public class SearchingExeption extends Exception {
    public static final String EMPLOYEE_NOT_FOUND = "Employee not found";
    public static final String COMPANY_NOT_FOUND = "Company not found";
    public static final String DATABASE_ERROR = "Database problem";

    public SearchingExeption(String message) {
        super(message);
    }
}
