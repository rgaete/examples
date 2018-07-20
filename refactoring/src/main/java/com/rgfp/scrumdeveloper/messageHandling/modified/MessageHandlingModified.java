package com.rgfp.scrumdeveloper.messageHandling.modified;

public class MessageHandlingModified {

    private InventoryModified inventory = new InventoryModified();
    private EmailPopServiceModified emailPopService = new EmailPopServiceModified();

    public String printStatus() {
        return buildMessage();
    }

    public String sendEmailWithStatus() {
        return emailPopService.send(buildMessage());
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
