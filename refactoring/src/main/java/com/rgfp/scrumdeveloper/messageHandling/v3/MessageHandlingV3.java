package com.rgfp.scrumdeveloper.messageHandling.v3;

public class MessageHandlingV3 {

    private InventoryV3 inventory = new InventoryV3();
    private EmailPopService emailPopService = new EmailPopService();

    public void printStatus() {
        System.out.println(buildMessage());

    }

    public void sendEmailWithStatus() {
        emailPopService.send(buildMessage());
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
