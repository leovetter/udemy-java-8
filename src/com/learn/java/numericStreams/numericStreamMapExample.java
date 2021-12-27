package com.learn.java.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class numericStreamMapExample {

  public static List<Integer> mapToObj() {

    return IntStream.range(0, 50)
        .mapToObj(i -> new Integer(i))
        .collect(Collectors.toList());
  }

  public static Long mapToLong() {

    return IntStream.range(0, 50)
        .mapToLong(i -> i)
        .sum();
  }

  public static Double mapToDouble() {

    return IntStream.range(0, 50)
        .mapToDouble(i -> i)
        .sum();
  }

  public static void main(String[] args) {

    System.out.println(mapToObj());
    System.out.println(mapToLong());
    System.out.println(mapToDouble());
  }
}
