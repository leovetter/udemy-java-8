package com.learn.java.lambdas;

import java.net.Inet4Address;
import java.util.function.Consumer;

public class LambdaVariable2 {

    static int value2 = 5;

    public static void main(String[] args) {

        int value = 4;
        /*Consumer<Integer> c1 = (i) -> {
            value++ // Not allowed
        };*/

        Consumer<Integer> c2 = (i) -> {
            value2++; // Allowed for static variables
        };
    }
}
