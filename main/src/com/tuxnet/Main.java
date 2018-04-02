package com.tuxnet;

import java.text.DecimalFormat;

public class Main {

    public static void main (String[] args) {
        HelloWord h = new HelloWord();
        h.sayHi();

        Int2Bin n = new Int2Bin();
        int number = 3;
        System.out.println(n.toBin(number));

        Rounding r = new Rounding();
        System.out.println(r.round(16.599785, 0));
    }
}

