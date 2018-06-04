package com.rgfp.scrumdeveloper.messageHandling;

public class MessageHandlingV1 {

    private Inventory inventory = new Inventory();
    private EmailService emailService = new EmailService();

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
