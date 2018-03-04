package com.kodilla.exception.test;

public class FlightApp {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Madrid", "Rome");

        FligthSearch fligthSearch = new FligthSearch();

        try {
            fligthSearch.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}