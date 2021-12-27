package com.learn.java.numericStreams;

import java.util.stream.IntStream;

public class numericStreamAggregateExample {

  public static void main(String[] args) {

    System.out.println(IntStream.range(0, 50).sum());
    System.out.println(IntStream.range(0, 50).max());
    System.out.println(IntStream.range(0, 50).min());
    System.out.println(IntStream.range(0, 50).average());
  }
}
