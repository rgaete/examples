package com.rgfp.scrumdeveloper.messageHandling.v1;

public class MessageHandlingV1 {

    private InventoryV1 inventory = new InventoryV1();
    private EmailPopServiceV1 emailService = new EmailPopServiceV1();

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
