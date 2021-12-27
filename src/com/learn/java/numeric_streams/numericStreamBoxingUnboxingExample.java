package com.learn.java.numeric_streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class numericStreamBoxingUnboxingExample {

  public static List<Integer> boxing() {

    return IntStream.range(0,10)
        .boxed()
        .collect(Collectors.toList());
  }

  public static int unboxing() {

    return boxing().stream()
        .mapToInt(Integer::intValue)
        .sum();
  }

  public static void main(String[] args) {

    System.out.println(boxing());
    System.out.println(unboxing());
  }
}
