package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLog() {
        //Given
        Logger logger = Logger.getInsatnce();
        //When
        logger.log("Log1");
        String getLog = logger.getLastLog();
        //Then
        Assert.assertEquals("Log1", getLog);
    }
}
