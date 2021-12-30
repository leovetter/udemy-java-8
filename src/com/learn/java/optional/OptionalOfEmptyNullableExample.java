package com.learn.java.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

  public static Optional<String> ofNullable() {

    return Optional.ofNullable(null);
  }

  public static Optional<String> empty() {

    return Optional.empty();
  }

  public static Optional<String> of() {

    return Optional.of(null);
  }

  public static void main(String[] args) {

    System.out.println(ofNullable());
    System.out.println(empty());
    System.out.println(of());

  }
}
