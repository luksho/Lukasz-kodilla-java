package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(5.00, 5.00);
        double sub = calculator.sub(5.00, 5.00);
        double mul = calculator.mul(5.00, 5.00);
        double div = calculator.div(5.00, 5.00);
        //Then
        Assert.assertEquals(10.00, add, 0.01);
        Assert.assertEquals(0.00, sub, 0.01);
        Assert.assertEquals(25.00, mul, 0.01);
        Assert.assertEquals(1.00, div, 0.01);
        Assert.assertNotEquals(5.00, add, 0.01);
    }
}
