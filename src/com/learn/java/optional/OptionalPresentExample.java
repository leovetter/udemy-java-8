package com.learn.java.optional;

import java.util.Optional;

public class OptionalPresentExample {

  public static void main(String[] args) {

    Optional<String> stringOpt = Optional.ofNullable("Hello World");
    if (stringOpt.isPresent()) {
      System.out.println(stringOpt.get());
    }

    stringOpt.ifPresent(System.out::println);
  }
}
