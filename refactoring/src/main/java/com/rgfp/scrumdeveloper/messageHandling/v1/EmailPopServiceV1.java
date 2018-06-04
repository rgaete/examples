package com.rgfp.scrumdeveloper.messageHandling.v1;

import com.rgfp.scrumdeveloper.messageHandling.v3.EmailServiceV3;

public class EmailPopServiceV1 extends EmailServiceV1 {

    // incomplete, implemented just for the refactoring exercises

    private static String protocol = "POP";

    public void send(String message) {
        System.out.println(message);
    }

}
