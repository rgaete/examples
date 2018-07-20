package com.rgfp.scrumdeveloper.messageHandling.initial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmailImapServiceInitialTest {

    @Test
    public void sendShouldReturnTheProtocolAndValuePassed() {

        EmailImapServiceInitial imapService = new EmailImapServiceInitial();

        String testingMessage = "testing message";
        assertEquals("[IMAP]Email sent with message " + testingMessage, imapService.send(testingMessage));

    }

}