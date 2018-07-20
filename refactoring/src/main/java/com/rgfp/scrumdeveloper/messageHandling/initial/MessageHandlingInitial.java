package com.rgfp.scrumdeveloper.messageHandling.initial;

public class MessageHandlingInitial {

    private InventoryInitial inventory = new InventoryInitial();
    private EmailPopServiceInitial emailService = new EmailPopServiceInitial();

    public void printStatus() {
        if (this.inventory.itemsLeft() > 0) {
            System.out.println("We have " + this.inventory.itemsLeft() + " items.");
        } else {
            System.out.println("We have no more items.");
        }
    }


    public void sendEmailWithStatus() {
        if (this.inventory.itemsLeft() > 0) {
            emailService.send("We have " + this.inventory.itemsLeft() + " items.");
        } else {
            emailService.send("We have no more items.");
        }
    }

}
