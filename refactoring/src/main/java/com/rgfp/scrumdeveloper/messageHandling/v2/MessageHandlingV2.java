package com.rgfp.scrumdeveloper.messageHandling.v2;

public class MessageHandlingV2 {

    private InventoryV2 inventory = new InventoryV2();
    private EmailServiceV2 emailService = new EmailServiceV2();

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
