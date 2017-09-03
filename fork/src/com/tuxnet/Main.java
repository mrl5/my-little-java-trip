package com.tuxnet;

import com.tuxnet.converters.Numeral;

public class Main {

    public static void main(String[] args) {
        Numeral n = new Numeral();
        int number = 15;
        System.out.println(number);
        System.out.println(n.toBin(number));
        System.out.println(n.toOct(number));
        System.out.println(n.toHex(number));
    }
}
