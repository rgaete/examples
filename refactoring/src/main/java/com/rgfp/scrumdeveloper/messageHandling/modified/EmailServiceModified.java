package com.rgfp.scrumdeveloper.messageHandling.modified;

public class EmailServiceModified {

    protected static String protocol;

    public String send(String message) {
        return "[" + protocol + "]Email sent with message " + message;
    }

}
