package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLog() {
        //Given
        Logger logger = Logger.getInstance();
        //When
        logger.log("Log1");
        logger.log("Log2");
        String getLog = logger.getLastLog();
        //Then
        Assert.assertEquals("Log2", getLog);
    }
}
