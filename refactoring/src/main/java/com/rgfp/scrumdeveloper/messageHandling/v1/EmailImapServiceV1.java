package com.rgfp.scrumdeveloper.messageHandling.v1;

import com.rgfp.scrumdeveloper.messageHandling.v3.EmailServiceV3;

public class EmailImapServiceV1 extends EmailServiceV1 {

    // incomplete, implemented just for the refactoring exercises

    private static String protocol = "IMAP";

    public void send(String message) {
        System.out.println(message);
    }

}
