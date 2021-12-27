package com.learn.java.numeric_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class numericStreamExample {

  public static Integer sum(List<Integer> integers) {

    return integers.stream()
        .reduce(0, (x, y) -> x+y); // Unboxing to convert the integers to int
  }

  public static Integer sumIntStream() {

    return IntStream.range(1, 8).sum();
  }

  public static void main(String[] args) {

    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

    System.out.println(sum(integers));
    System.out.println(sumIntStream());
  }
}
