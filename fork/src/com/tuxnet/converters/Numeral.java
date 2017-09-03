package com.tuxnet.converters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static java.lang.Math.pow;

/*
   @author mrl5
 */

public class Numeral {


    enum Hex {
        A, B, C, D, E, F;
    }

    ;

    private String format(List list) {
        Hex[] hex = Hex.values();
        String s = "";

        for (Object o : list) {
            if (Integer.valueOf(o.toString()) > 9) {
                s += hex[Integer.valueOf(o.toString()) - 10];
            } else s += o.toString();
        }

        return s;
    }

    // Convert decimal to binary
    private List toBinary(int number) {
        List binNumber = new ArrayList();
        while (number > 1) {
            binNumber.add(number % 2);
            number = number / 2;
        }
        binNumber.add(number);
        //change order to MSB->LSB
        Collections.reverse(binNumber);

        return binNumber;
    }

    //Convert binary to 2^ANY numeral system
    private List convert(List binNumber, int exp) {
        List sysnumNumber = new ArrayList();
        int counter = 0;
        int digit = 0;

        //change order (LSB->MSB)
        Collections.reverse(binNumber);

        for (Object o : binNumber) {
            digit += (pow(2, counter) * Integer.valueOf(o.toString()));
            counter++;
            if (counter == exp) {
                sysnumNumber.add(digit);
                digit = 0;
                counter = 0;
            }
        }

        if (digit != 0) {
            sysnumNumber.add(digit);
        }
        //change order to MSD->LSD
        Collections.reverse(sysnumNumber);
        return sysnumNumber;
    }

    // Return binary
    public String toBin(int number) {
        return format(toBinary(number)) + " (BIN)";
    }

    // Return octal
    public String toOct(int number) {
        return format(convert(toBinary(number), 3)) + " (OCT)";
    }

    // Return hexadecimal
    public String toHex(int number) {
        return format(convert(toBinary(number), 4)) + " (HEX)";
    }
}
