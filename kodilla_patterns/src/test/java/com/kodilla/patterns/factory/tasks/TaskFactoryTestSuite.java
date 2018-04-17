package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void TestFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();
        boolean isTaskExecuted = shoppingTask.isTaskExecuted();
        String getTaskName = shoppingTask.getTaskName();
        //Then
        Assert.assertEquals(true, isTaskExecuted);
        Assert.assertEquals("Buy", getTaskName);
    }

    @Test
    public void TestFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();
        boolean isTaskExecuted = paintingTask.isTaskExecuted();
        String getTaskName = paintingTask.getTaskName();
        //Then
        Assert.assertEquals(true, isTaskExecuted);
        Assert.assertEquals("Paint", getTaskName);
    }

    @Test
    public void TestFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        boolean isTaskExecuted = drivingTask.isTaskExecuted();
        String getTaskName = drivingTask.getTaskName();
        //Then
        Assert.assertEquals(false, isTaskExecuted);
        Assert.assertEquals("Driving", getTaskName);
    }
}
