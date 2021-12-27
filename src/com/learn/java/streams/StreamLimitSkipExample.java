package com.learn.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

  public static Optional<Integer> limit(List<Integer> integers) {

    return integers.stream().limit(3).reduce((x, y) -> x+y);
  }

  public static Optional<Integer> skip(List<Integer> integers) {

    return integers.stream().skip(3).reduce((x, y) -> x+y);
  }

  public static void main(String[] args) {

    List<Integer> integers = Arrays.asList(6, 7, 9, 5, 3, 12);

    System.out.println(limit(integers));
    System.out.println(skip(integers));
  }
}
