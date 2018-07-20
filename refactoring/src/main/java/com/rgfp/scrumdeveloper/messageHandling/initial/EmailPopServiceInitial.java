package com.rgfp.scrumdeveloper.messageHandling.initial;

public class EmailPopServiceInitial extends EmailServiceInitial {

    // incomplete, implemented just for the refactoring exercises

    private static String protocol = "POP";

    public String send(String message) {
        return "[" + protocol + "]Email sent with message " + message;
    }

}
