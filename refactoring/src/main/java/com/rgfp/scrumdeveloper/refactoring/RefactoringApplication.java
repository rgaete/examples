package com.rgfp.scrumdeveloper.refactoring;

import com.rgfp.scrumdeveloper.messageHandling.MessageHandlingV1;
import com.rgfp.scrumdeveloper.messageHandling.MessageHandlingV2;
import com.rgfp.scrumdeveloper.messageHandling.MessageHandlingV3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RefactoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefactoringApplication.class, args);

        MessageHandlingV1 messageHandlingV1 = new MessageHandlingV1();
        MessageHandlingV2 messageHandlingV2 = new MessageHandlingV2();
        MessageHandlingV3 messageHandlingV3 = new MessageHandlingV3();

        System.out.print("V1 message: ");
        messageHandlingV1.printStatus();

        System.out.print("V2 message: ");
        messageHandlingV2.printStatus();

        System.out.print("V3 message: ");
        messageHandlingV3.printStatus();
	}
}
