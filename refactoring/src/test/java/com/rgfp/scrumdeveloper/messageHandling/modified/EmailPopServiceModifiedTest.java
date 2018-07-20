package com.rgfp.scrumdeveloper.messageHandling.modified;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmailPopServiceModifiedTest {

    @Test
    public void sendShouldReturnTheProtocolAndValuePassed() {

        EmailPopServiceModified imapService = new EmailPopServiceModified();

        String testingMessage = "testing message";
        assertEquals("[POP]Email sent with message " + testingMessage, imapService.send(testingMessage));

    }

}