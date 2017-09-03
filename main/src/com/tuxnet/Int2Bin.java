package com.tuxnet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Int2Bin {

    public String toBin(int number) {
        List binNumber = new ArrayList();
        String s = "";

        while (number > 1) {
            binNumber.add(number % 2);
            number = number / 2;
        }
        binNumber.add(number);

        //change order to MSB->LSB
        Collections.reverse(binNumber);

        for (Object o : binNumber) {
            s += o.toString();
        }

        return s + "(BIN)";
    }
}
