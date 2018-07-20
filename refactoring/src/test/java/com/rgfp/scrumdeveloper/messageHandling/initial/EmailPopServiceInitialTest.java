package com.rgfp.scrumdeveloper.messageHandling.initial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmailPopServiceInitialTest {

    @Test
    public void sendShouldReturnTheProtocolAndValuePassed() {

        EmailPopServiceInitial popService = new EmailPopServiceInitial();

        String testingMessage = "testing message";
        assertEquals("[POP]Email sent with message " + testingMessage, popService.send(testingMessage));

    }


}