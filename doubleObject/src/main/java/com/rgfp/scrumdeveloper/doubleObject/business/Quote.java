package com.rgfp.scrumdeveloper.doubleObject.business;

import com.rgfp.scrumdeveloper.doubleObject.service.QuoteClient;

public class Quote {

    private String text;
    private QuoteClient quoteClient;

    public Quote() {
        this.text = "";
        if (this.quoteClient == null) {
            this.quoteClient = new QuoteClient();
        }
    }

    public String getText() {
        return text;
    }

    public Quote(QuoteClient quoteClient) {
        this.quoteClient = quoteClient;
    }

    public void fetchNewQuote() {
        this.text = quoteClient.getQuote();
    }

    public int getLength() {
        return this.text.length();
    }

    public int howManyTimesTheWord(String wordToLook) {
        int times = 0;
        int index = 0;
        while (this.text.toLowerCase().substring(index).indexOf(wordToLook) != -1) {
            times ++;
            index = Integer.min(this.text.length(), index + this.text.substring(index).indexOf(wordToLook) + wordToLook.length());
        }
        return times;
    }

    public String reverse() {
        String[] split = this.text.split(" ");
        String reversePhrase = "";
        for (int i = split.length - 1; i >= 0;  i--) {
            reversePhrase += split[i] + " ";
        }
        return reversePhrase.trim();
    }
}
