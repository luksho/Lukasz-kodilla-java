package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FligthSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airport = new HashMap<>();
        airport.put("Madrid", false);
        airport.put("Rome", false);
        airport.put("London", true);
        airport.put("New York", false);

        if (airport.containsKey(flight.getDepartureAirport().equals(flight.getArrivalAirport()))) {
            System.out.println("You can't flight to the same destination");
        } else if (airport.containsKey(flight.getDepartureAirport()) && airport.containsKey(flight.getArrivalAirport())) {
            System.out.println("Flight from " + flight.getDepartureAirport() + " is available ");
        } else {
            throw new RouteNotFoundException("Flight not found choose another airport");
        }

        if (airport.getOrDefault(flight.getArrivalAirport(), false)) {
            System.out.println("but to " + flight.getArrivalAirport() + " from " + flight.getDepartureAirport() + " is inaccessable, choose another destination");
        }
    }
}
