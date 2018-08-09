package com.rgfp.scrumdeveloper.unitTest;

public class MathOperations {

    public static Integer sum(Integer [] numbers) {
        Integer result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public static Integer max(Integer [] numbers) {

        Integer max = numbers.length > 0 ? Integer.MIN_VALUE : null;

        for (Integer number: numbers) {
            max = number > max ? number :  max;
        }

        return max;
    }

    public static Integer min(Integer[] numbers) {

        Integer min = numbers.length > 0 ? Integer.MAX_VALUE : null;

        for (Integer number: numbers) {
            min = number < min ? number :  min;
        }

        return min;
    }

    public static Float average(Integer[] numbers) {

        Integer sum = MathOperations.sum(numbers);

        Float average = numbers.length > 0 ? Float.valueOf(sum) / Float.valueOf(numbers.length) : null;

        return average;
    }

    public static Integer length(Integer[] numbers) {

        return numbers.length;
    }

    public static Integer square(Integer number) {

        return number * number;

    }

    public static Integer factorial(Integer number) {
        if (number < 0) {
            throw new ArithmeticException("number must be > 0");
        } else if (number <= 1) {
            return number;
        } else {
            return number * factorial(number - 1);
        }
    }

}
