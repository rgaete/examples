package com.rgfp.scrumdeveloper.tdd;

class StringCalculator {

    static int add(String numbers) {

        boolean hasSeparator = numbers.indexOf("//") != - 1;
        String separator;
        if (!hasSeparator) {
            separator = "[,|\\n]";
        } else {
            int separatorBegins = numbers.indexOf("//") + 2;
            int separatorEnds = numbers.indexOf("\n");
            separator = numbers.substring(separatorBegins, separatorEnds);
            numbers = numbers.substring(separatorEnds + 1);
        }

        int sum = 0;

        for (String number: numbers.split(separator)) {
            sum+= Integer.parseInt("".equals(number) ? "0" : number);
        }

        return sum;
    }
}
