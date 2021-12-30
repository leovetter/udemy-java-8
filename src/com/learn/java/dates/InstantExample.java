package com.learn.java.dates;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {

  public static void main(String[] args) {

    Instant instant = Instant.now();
    System.out.println(instant); // It is formatted for printing
    System.out.println(instant.getEpochSecond()); // real value

    System.out.println(Instant.ofEpochSecond(0));

    Duration duration = Duration.between(instant, Instant.ofEpochSecond(78563));
    System.out.println(duration);
  }
}
