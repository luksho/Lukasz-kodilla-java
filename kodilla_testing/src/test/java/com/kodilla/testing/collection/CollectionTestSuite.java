package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> EmptyList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> EmptyListExpectations = new ArrayList<Integer>();
        OddNumbersExterminator.exterminate(EmptyList);
        //Then
        Assert.assertEquals(EmptyListExpectations, EmptyList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(8);
        //When
        ArrayList<Integer> listExpectations = new ArrayList<Integer>();
        listExpectations.add(5);
        listExpectations.add(7);
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(list);
        //Then
        Assert.assertEquals(listExpectations, result);
    }
}
