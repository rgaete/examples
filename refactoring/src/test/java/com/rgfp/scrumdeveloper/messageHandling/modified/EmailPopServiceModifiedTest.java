package com.rgfp.scrumdeveloper.messageHandling.modified;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmailPopServiceModifiedTest {

    @Test
    public void sendShouldReturnTheValuePassed() {

        EmailPopServiceModified popService = new EmailPopServiceModified();

        String testingMessage = "testing message";
        assertEquals(testingMessage, popService.send(testingMessage));

    }

}