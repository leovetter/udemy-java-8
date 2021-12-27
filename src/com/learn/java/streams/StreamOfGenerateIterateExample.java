package com.learn.java.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

  public static void main(String[] args) {

    Stream<String> strings = Stream.of("Adam", "Julie", "Lucille");
    strings.forEach(System.out::println);

    Stream.iterate(1, x -> x+2)
        .limit(10)
        .forEach(System.out::println);

    Supplier<Integer> integers = new Random()::nextInt;

    Stream.generate(integers)
        .limit(5)
        .forEach(System.out::println);
  }
}
