package com.rgfp.scrumdeveloper.refactoring;

import com.rgfp.scrumdeveloper.messageHandling.initial.MessageHandlingInitial;
import com.rgfp.scrumdeveloper.messageHandling.modified.MessageHandlingModified;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RefactoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefactoringApplication.class, args);

        MessageHandlingInitial messageHandlingInitial = new MessageHandlingInitial();
        MessageHandlingModified messageHandlingModified = new MessageHandlingModified();

        System.out.println("Printing ");

        System.out.print("Initial version message: ");
        messageHandlingInitial.printStatus();

        System.out.print("Modified version message: ");
        messageHandlingModified.printStatus();


        System.out.println("Sending email ");

        System.out.print("Initial version message: ");
        messageHandlingInitial.sendEmailWithStatus();

        System.out.print("Final version message: ");
        messageHandlingModified.sendEmailWithStatus();
	}
}
