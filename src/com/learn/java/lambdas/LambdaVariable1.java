package com.learn.java.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {

    public static void main(String[] args) {

        int i = 0;

        // Not allowed to reused the name of the local variable
        /*Consumer<Integer> c1 = (i) -> {
            System.out.println(i);
        };
        Consumer<Integer> c2 = (i1) -> {
            int i = 0;
            System.out.println(i);
        };*/
    }
}
