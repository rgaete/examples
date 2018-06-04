package com.rgfp.scrumdeveloper.messageHandling;

public class MessageHandlingV1 {

    private Inventory inventory = new Inventory();
    private EmailPopService emailPopService = new EmailPopService();

    public void printStatus() {
        if (this.inventory.itemsLeft() > 0) {
            System.out.println("We have " + this.inventory.itemsLeft() + " items.");
        } else {
            System.out.println("We have no more items.");
        }
    }


    public void sendEmailWithStatus() {
        if (this.inventory.itemsLeft() > 0) {
            emailPopService.send("We have " + this.inventory.itemsLeft() + " items.");
        } else {
            emailPopService.send("We have no more items.");
        }
    }

}
