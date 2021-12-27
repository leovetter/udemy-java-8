package com.learn.java.functionalInterfaces;

import java.util.Locale;
import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> f1 = str -> str.toUpperCase();
    static Function<String, String> addSomeString = str -> str.concat("default");

    public static void main(String[] args) {

        System.out.println(f1.apply("java8"));
        System.out.println(f1.andThen(addSomeString).apply("java8"));
        System.out.println(f1.compose(addSomeString).apply("java8"));

    }
}
