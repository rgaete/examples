package com.rgfp.scrumdeveloper.messageHandling.initial;

public class EmailImapServiceInitial extends EmailServiceInitial {

    // incomplete, implemented just for the refactoring exercises

    private static String protocol = "IMAP";

    public void send(String message) {
        System.out.println(message);
    }

}
