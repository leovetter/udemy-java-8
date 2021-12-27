package com.learn.java.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comp1 = (a, b) -> a.compareTo((b));

    public static void main(String[] args) {

        BinaryOperator<Integer> bo1 = (a, b) -> a*b;
        System.out.println(bo1.apply(5,4));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comp1);
        System.out.println(maxBy.apply(5,4));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comp1);
        System.out.println(minBy.apply(5,4));
    }
}
