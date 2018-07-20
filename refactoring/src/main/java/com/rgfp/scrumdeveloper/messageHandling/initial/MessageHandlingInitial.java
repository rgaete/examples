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
            return "Status: We have " + this.inventory.itemsLeft() + " items.";
        } else {
            return "Status: We have no more items.";
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
