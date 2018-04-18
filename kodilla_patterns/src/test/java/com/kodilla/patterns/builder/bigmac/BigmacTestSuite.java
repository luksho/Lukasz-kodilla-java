package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bun")
                .burgers(2)
                .sauce("spicy")
                .ingredients("cheese")
                .ingredients("lettuce")
                .ingredients("mushrooms")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String sauceType = bigmac.getSauce();
        int howManyBurgers = bigmac.getBurgers();
        //Then
        Assert.assertEquals("spicy", sauceType);
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals(3, howManyIngredients);
    }
}
