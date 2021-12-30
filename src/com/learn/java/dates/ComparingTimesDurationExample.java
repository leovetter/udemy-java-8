package com.learn.java.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {

  public static void main(String[] args) {

    LocalTime localTime1 = LocalTime.now();
    LocalTime localTime2 = LocalTime.of(21, 45);

    long diff = localTime2.until(localTime1, ChronoUnit.MINUTES);
    System.out.println(diff);

    Duration duration = Duration.between(localTime2, localTime1);
    System.out.println(duration);
    System.out.println(duration.toMinutes());

    Duration duration1 = Duration.ofDays(2);
    System.out.println(duration1);
  }
}
