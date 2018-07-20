package com.rgfp.scrumdeveloper.messageHandling.initial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmailImapServiceInitialTest {

    @Test
    public void sendShouldReturnTheValuePassed() {

        EmailImapServiceInitial imapService = new EmailImapServiceInitial();

        String testingMessage = "testing message";
        assertEquals(testingMessage, imapService.send(testingMessage));

    }

}