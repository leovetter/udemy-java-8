package com.learn.java.methodReference;

import java.util.function.Function;

public class FunctionMethodReference {

    static Function<String, String> toUpperCaseMethodRef = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println(toUpperCaseMethodRef.apply("java8"));
    }
}
