package com.rgfp.scrumdeveloper.messageHandling.modified;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmailImapServiceModifiedTest {

    @Test
    public void sendShouldReturnTheValuePassed() {

        EmailImapServiceModified imapService = new EmailImapServiceModified();

        String testingMessage = "testing message";
        assertEquals(testingMessage, imapService.send(testingMessage));

    }

}