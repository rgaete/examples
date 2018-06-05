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

        // Arrange

        // Act

        // Assert
    }

}