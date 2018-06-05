package com.rgfp.scrumdeveloper.unitTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathOperationsTest {

    @Test
    public void itShouldSumAnArrayOfNumbers() {

        // Arrange
        Integer[] numbers = {1,2,3};

        // Act
        Integer result = MathOperations.sum(numbers);

        // Assert
        assertEquals(new Integer(6), result);

    }

    @Test
    public void itShouldSumZeroForAnEmptyArray() {
        Integer[] numbers = {};

        Integer result = MathOperations.sum(numbers);

        assertEquals(new Integer(0), result);
    }

    @Test
    public void itShouldReturnTheMaxValueOfAnArray() {
        Integer[] numbers = {1,2,3};

        Integer result = MathOperations.max(numbers);

        assertEquals(new Integer(3), result);
    }

    @Test
    public void itShouldReturnAMaxOfNullForAnEmptyArray() {
        Integer[] numbers = {};

        Integer result = MathOperations.max(numbers);

        assertNull(result);
    }

    @Test
    public void itShouldReturnTheMinValueOfAnArray() {
        Integer[] numbers = {1,2,3};

        Integer result = MathOperations.min(numbers);

        assertEquals(new Integer(1), result);
    }

    @Test
    public void itShouldReturnAMinOfNullForAnEmptyArray() {
        Integer[] numbers = {};

        Integer result = MathOperations.min(numbers);

        assertNull(result);
    }

    @Test
    public void itShouldReturnTheAvgValueOfAnArray() {
        Integer[] numbers = {1,2,1};

        Float result = MathOperations.average(numbers);

        assertEquals(new Float(1.3333333), result, 0.000001f);
    }

    @Test
    public void itShouldReturnAnAvgOfNullForAnEmptyArray() {
        Integer[] numbers = {};

        Float result = MathOperations.average(numbers);

        assertNull(result);
    }

    @Test
    public void itShouldTheLengthOfAnArray() {

        Integer[] numbers = {1,2,3};

        Integer result = MathOperations.length(numbers);

        assertEquals(new Integer(3), result);

    }

    @Test
    public void itShouldReturnALengthOfZeroForAnEmptyArray() {
        Integer[] numbers = {};

        Integer result = MathOperations.length(numbers);

        assertEquals(new Integer(0), result);
    }

}