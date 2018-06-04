package com.rgfp.scrumdeveloper.messageHandling;

public class MessageHandlingV2 {

    private Inventory inventory = new Inventory();
    private EmailService emailService;

    public void printStatus() {
        int itemsLeft = this.inventory.itemsLeft();
        String message;
        if (itemsLeft > 0) {
            message = "We have " + itemsLeft + " items.";
        } else {
            message = "We have no more items.";
        }

        System.out.println(message);

    }

    public void sendEmailWithStatus() {
        int itemsLeft = this.inventory.itemsLeft();
        String message;
        if (itemsLeft > 0) {
            message = "We have " + this.inventory.itemsLeft() + " items.";
        } else {
            message = "We have no more items.";
        }
        emailService.send(message);
    }

}
