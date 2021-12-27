package com.learn.java.numericStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class numericStreamRangesExample {

  public static void main(String[] args) {

    System.out.println(IntStream.range(1, 50).count());
    System.out.println(IntStream.rangeClosed(1, 50).count());

    System.out.println(LongStream.range(1, 50).count());
    System.out.println(LongStream.rangeClosed(1, 50).count());

    IntStream.range(1, 50).asDoubleStream().forEach(System.out::println);
  }
}
