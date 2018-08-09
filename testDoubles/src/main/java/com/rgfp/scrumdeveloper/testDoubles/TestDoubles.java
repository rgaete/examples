package com.rgfp.scrumdeveloper.testDoubles;

import com.rgfp.scrumdeveloper.testDoubles.business.Quote;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestDoubles {

	public static void main(String[] args) {
		SpringApplication.run(TestDoubles.class, args);

		Quote quote = new Quote();

        System.out.println("---------------------------------------");
        System.out.println("Original quote: " + quote.getText());
        System.out.println("Quote length: " + quote.getLength());
        System.out.println("Saying spring " + quote.howManyTimesTheWord("spring"));
        System.out.println("Reverse frase: " + quote.reverse());
        System.out.println("---------------------------------------");

    }

}
