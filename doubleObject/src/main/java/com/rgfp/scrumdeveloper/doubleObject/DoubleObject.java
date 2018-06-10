package com.rgfp.scrumdeveloper.doubleObject;

import com.rgfp.scrumdeveloper.doubleObject.business.Quote;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoubleObject {

	public static void main(String[] args) {
		SpringApplication.run(DoubleObject.class, args);

		Quote quote = new Quote();
		quote.fetchNewQuote();

        System.out.println("Original quote: " + quote.getText());
        System.out.println("Quote length: " + quote.getLength());
        System.out.println("Saying spring " + quote.howManyTimesTheWord("spring"));
        System.out.println("Reverse frase: " + quote.reverse());

    }

}
