package com.rgfp.scrumdeveloper.refactoring;

import com.rgfp.scrumdeveloper.common.Inventory;
import com.rgfp.scrumdeveloper.messageHandling.initial.MessageHandlingInitial;
import com.rgfp.scrumdeveloper.messageHandling.modified.MessageHandlingModified;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RefactoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefactoringApplication.class, args);

        Inventory inventory = new Inventory(5);
        MessageHandlingInitial messageHandlingInitial = new MessageHandlingInitial(inventory);
        MessageHandlingModified messageHandlingModified = new MessageHandlingModified(inventory);

        System.out.println("Printing ");

        System.out.println("Initial version message: ");
        System.out.println(messageHandlingInitial.printStatus());

        System.out.println("Modified version message: ");
        System.out.println(messageHandlingModified.printStatus());


        System.out.println("Sending email ");

        System.out.println("Initial version message: ");
        System.out.println(messageHandlingInitial.sendEmailWithStatus());

        System.out.println("Final version message: ");
        System.out.println(messageHandlingModified.sendEmailWithStatus());
	}
}
