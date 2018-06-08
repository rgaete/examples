package com.rgfp.scrumdeveloper.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void itShouldReturnZeroForAnEmptyString() {

        assertEquals(0, StringCalculator.add(""));

    }


    @Test
    public void itShouldReturnOneForTheStringOne() {

        assertEquals(1, StringCalculator.add("1"));

    }

    @Test
    public void itShouldReturnThreeForTheStringOneTwo() {

        assertEquals(3, StringCalculator.add("1,2"));

    }

    @Test
    public void itShouldSumCorrectlyWithTheNewLineSeparator() {

        assertEquals(3, StringCalculator.add("1\n2"));

    }

    @Test
    public void itShouldReadTheSeparatorAndSumCorrectyle() {

        assertEquals(3, StringCalculator.add("//-\n1-2"));

    }

}