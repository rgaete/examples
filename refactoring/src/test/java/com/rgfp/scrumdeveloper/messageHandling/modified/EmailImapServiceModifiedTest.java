package com.rgfp.scrumdeveloper.messageHandling.modified;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmailImapServiceModifiedTest {

    @Test
    public void sendShouldReturnTheProtocolAndValuePassed() {

        EmailImapServiceModified imapService = new EmailImapServiceModified();

        String testingMessage = "testing message";
        assertEquals("[IMAP]Email sent with message " + testingMessage, imapService.send(testingMessage));

    }


}