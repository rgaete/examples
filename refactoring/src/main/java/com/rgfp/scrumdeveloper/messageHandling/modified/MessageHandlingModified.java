package com.rgfp.scrumdeveloper.messageHandling.modified;

import com.rgfp.scrumdeveloper.common.Inventory;

public class MessageHandlingModified {

    public MessageHandlingModified(Inventory inventory) {
        this.inventory = inventory;
    }

    private Inventory inventory;
    private EmailPopServiceModified emailPopService = new EmailPopServiceModified();

    public String printStatus() {
        return buildMessage();
    }

    public String sendEmailWithStatus() {
        return emailPopService.send(buildMessage());
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
