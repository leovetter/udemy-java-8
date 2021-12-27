package com.learn.java.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

  static Predicate<Integer> p1 = (i) -> (i%2 == 0);

  static Predicate<Integer> p2 = (i) -> (i%5 == 0);

  public static void predicateAnd() {

    System.out.println("predicate AND result 1 : " + p1.and(p2).test(10)); //predicate chaining
    System.out.println("predicate AND result 2 : " + p1.and(p2).test(9));
  }

  public static void predicateOr() {

    System.out.println("predicate OR result 1 : " + p1.or(p2).test(10));
    System.out.println("predicate OR result 2 : " + p1.or(p2).test(8));
  }

  public static void predicateNegate() {

    System.out.println("predicate NEGATE result 2 : " + p1.or(p2).negate().test(8));
  }

  public static void main(String[] args) {

    System.out.println("Is even : " + p1.test(60));

    predicateAnd();
    predicateOr();
    predicateNegate();
  }
}
