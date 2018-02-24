package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void shouldGetWorldPeopleQuantity(){


        //Given
        Country poland = new Country(new BigDecimal("38748547"));
        Country england = new Country(new BigDecimal("53001254"));
        Country canada = new Country(new BigDecimal("36125478"));
        Country usa = new Country(new BigDecimal("323658452"));
        Country ghana = new Country(new BigDecimal("28211547"));

        Continent america = new Continent();
        Continent europa = new Continent();
        Continent africa = new Continent();

        World world = new World();


        //When
        america.addCountry(canada);
        america.addCountry(usa);

        europa.addCountry(poland);
        europa.addCountry(england);

        africa.addCountry(ghana);

        world.addContinent(america);
        world.addContinent(europa);
        world.addContinent(africa);
        world.addContinent(africa);

        //Then
        Assert.assertEquals(new BigDecimal("479745278"),world.getPeopleQuantity());
        Assert.assertEquals(3,world.getContinentList().size());

    }
}
