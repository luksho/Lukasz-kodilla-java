package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    public void shouldGetAverage() {
        //Given
        int[] testList = {2, 4, 5, 3, 5, 2, 5, 6, 5, 2, 3, 4, 5, 6, 4, 2, 3, 4, 5, 6};
        //When
        double average = ArrayOperations.getAverage(testList);
        //Then
        assertEquals(4.05,average,0.001);
    }
}
