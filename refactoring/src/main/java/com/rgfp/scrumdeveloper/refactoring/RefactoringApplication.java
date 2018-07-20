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

        System.out.print("V1 message: ");
        messageHandlingInitial.printStatus();

        System.out.print("V4 message: ");
        messageHandlingModified.printStatus();


        System.out.println("Sending email ");

        System.out.print("V1 message: ");
        messageHandlingInitial.sendEmailWithStatus();

        System.out.print("V4 message: ");
        messageHandlingModified.sendEmailWithStatus();
	}
}
