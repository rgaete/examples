package com.rgfp.scrumdeveloper.complexity;

public class ComplexityExamples {

    public int sumOfPrimes(int max){
        int total = 0;
        for (int i = 0; i <= max; i++) {
            for (int j = 2; j < i; j++) {
                if(i%j == 0){
                    break;
                }
            }
        total += i;
        }
        return total;
    }

    public String getWords(int number){
        switch (number) {
            case 1:
                return "one";
            case 2:
                return "a couple";
            case 3:
                return "a few";
            default:
                return "a lot";
        }
    }

}
