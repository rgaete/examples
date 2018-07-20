package com.rgfp.scrumdeveloper.messageHandling.initial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmailPopServiceInitialTest {

    @Test
    public void sendShouldReturnTheValuePassed() {

        EmailPopServiceInitial popService = new EmailPopServiceInitial();

        String testingMessage = "testing message";
        assertEquals(testingMessage, popService.send(testingMessage));

    }

}