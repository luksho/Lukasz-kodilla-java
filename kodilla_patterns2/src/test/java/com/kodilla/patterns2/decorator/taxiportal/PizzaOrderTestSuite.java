package com.kodilla.patterns2.decorator.taxiportal;

import com.kodilla.patterns2.decorator.pizza.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void ShouldGetCostOfPizzaWithAllIngredients() {
        //Given
        PizzaOrder pizzaOrder = new StandardPizzaOrder();
        pizzaOrder = new MozarellaDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new PeperoniPeppersDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getCost());
        //When
        BigDecimal pizzaCost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(27), pizzaCost);
    }

    @Test
    public void ShouldGetDescriptionOfPizzaWithAllIngredients() {
        //Given
        PizzaOrder pizzaOrder = new StandardPizzaOrder();
        pizzaOrder = new MozarellaDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new PeperoniPeppersDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getDescription());
        //When
        String pizzaDescription = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals("Pizza + tomato souce + mozarella + mozarella + ham + mushrooms + peperoni peppers", pizzaDescription);
    }
}
