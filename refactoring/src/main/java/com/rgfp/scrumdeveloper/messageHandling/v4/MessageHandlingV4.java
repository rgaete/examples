package com.rgfp.scrumdeveloper.messageHandling.v4;

public class MessageHandlingV4 {

    private InventoryV4 inventory = new InventoryV4();
    private EmailPopServiceV4 emailPopService = new EmailPopServiceV4();

    public void printStatus() {
        System.out.println(buildMessage());
    }

    public void sendEmailWithStatus() {
        emailPopService.send(buildMessage());
    }

    private String buildMessage() {
        int itemsLeft = this.inventory.itemsLeft(false);
        String message;
        if (itemsLeft > 0) {
            message = "We have " + itemsLeft + " items.";
        } else {
            message = "We have no more items.";
        }
        return message;
    }

}
