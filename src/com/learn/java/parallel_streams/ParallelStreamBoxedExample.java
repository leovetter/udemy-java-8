package com.learn.java.parallel_streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

  public static void seqSum(List<Integer> integers) {

    long startTime = System.currentTimeMillis();

    integers.stream()
        .reduce(0, (x, y) -> x+y);

    long endTime = System.currentTimeMillis();

    System.out.println(endTime - startTime);
  }

  public static void parSum(List<Integer> integers) {

    long startTime = System.currentTimeMillis();

    integers.stream()
        .parallel()
        .reduce(0, (x, y) -> x+y); // perform the unboxing from Integer to int

    long endTime = System.currentTimeMillis();

    System.out.println(endTime - startTime);
  }

  public static void main(String[] args) {

    List<Integer> integers = IntStream.range(0, 100000).boxed().collect(Collectors.toList());

    seqSum(integers);
    parSum(integers);
  }
}
