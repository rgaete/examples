package com.rgfp.scrumdeveloper.messageHandling;

public class MessageHandlingV3 {

    private Inventory inventory = new Inventory();
    private EmailService emailService;

    public void printStatus() {
        System.out.println(buildMessage());

    }

    public void sendEmailWithStatus() {
        emailService.send(buildMessage());
    }

    private String buildMessage() {
        int itemsLeft = this.inventory.itemsLeft();
        String message;
        if (itemsLeft > 0) {
            message = "We have " + itemsLeft + " items.";
        } else {
            message = "We have no more items.";
        }
        return message;
    }

}
