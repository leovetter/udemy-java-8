package com.learn.java.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> u1 = (s) -> s.concat("default");

    public static void main(String[] args) {

        System.out.println(u1.apply("java8"));
    }
}
