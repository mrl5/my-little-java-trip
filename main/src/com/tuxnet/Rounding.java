package com.tuxnet;

import java.text.DecimalFormat;

public class Rounding {
    private String format = "0.";

    private String calc(double number) {
        DecimalFormat df = new DecimalFormat(format);
        return df.format(number);
    }

    public String round(double number, int precision) {
        String output = "";
        try {
            for (int i = 1; i < precision; i++) {
                format += "#";
            }

            output = calc(number);
        } catch (IllegalArgumentException e) {
            System.out.println("Rounding precision parameter must fulfil the condition: \"precision >= 0\"");
        }
        return output;

    }
}
