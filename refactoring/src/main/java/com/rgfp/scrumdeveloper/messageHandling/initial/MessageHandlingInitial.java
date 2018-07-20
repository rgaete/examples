package com.rgfp.scrumdeveloper.messageHandling.initial;

import com.rgfp.scrumdeveloper.common.Inventory;

public class MessageHandlingInitial {

    public MessageHandlingInitial(Inventory inventory) {
        this.inventory = inventory;
    }

    private Inventory inventory;
    private EmailPopServiceInitial emailService = new EmailPopServiceInitial();

    public String printStatus() {
        if (this.inventory.itemsLeft() > 0) {
            return "We have " + this.inventory.itemsLeft() + " items.";
        } else {
            return "We have no more items.";
        }
    }


    public String sendEmailWithStatus() {
        if (this.inventory.itemsLeft() > 0) {
            return emailService.send("We have " + this.inventory.itemsLeft() + " items.");
        } else {
            return emailService.send("We have no more items.");
        }
    }

}
