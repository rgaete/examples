package com.rgfp.scrumdeveloper.doubleObject.business;

import com.rgfp.scrumdeveloper.doubleObject.service.QuoteClient;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class QuoteTest {

    private Quote quote;

    @Before
    public void setup() {
        QuoteClient quoteClient = mock(QuoteClient.class);

        when(quoteClient.getQuote()).thenReturn("Hello java springers, let's learn spring boot");

        quote = new Quote(quoteClient);
    }

    @Test
    public void itShouldReturnTheLengthOfThePhrase() {
        assertEquals(45, quote.getLength());
    }

    @Test
    public void itShouldCountTheWordsOnAPhrase() {
        assertEquals(1, quote.howManyTimesTheWord("Hello"));
        assertEquals(2, quote.howManyTimesTheWord("spring"));
        assertEquals(6, quote.howManyTimesTheWord(" "));
    }

    @Test
    public void itShouldReturnZeroWhenTheWordIsNotFound() {
        assertEquals(0, quote.howManyTimesTheWord("Bye"));
    }

    @Test
    public void itShouldReverseThePhrase() {
        assertEquals("boot spring learn let's springers, java Hello", quote.reverse());
    }


}