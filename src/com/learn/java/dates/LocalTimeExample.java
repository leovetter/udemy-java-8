package com.learn.java.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

  public static void main(String[] args) {

    LocalTime localTime1 = LocalTime.now();
    System.out.println(localTime1);

    LocalTime localTime2 = LocalTime.of(23, 11);
    System.out.println(localTime2);

    LocalTime localTime3 = LocalTime.of(5, 6, 45);
    System.out.println(localTime3);

    LocalTime localTime4 = LocalTime.of(5, 6, 45, 456);
    System.out.println(localTime4);

    System.out.println(localTime1.getHour());
    System.out.println(localTime1.getMinute());
    System.out.println(localTime1.get(ChronoField.CLOCK_HOUR_OF_DAY));
    System.out.println(localTime1.toSecondOfDay());

    System.out.println(localTime1.minusHours(2));
    System.out.println(localTime1.minus(2 , ChronoUnit.HOURS));
    System.out.println(localTime1.with(LocalTime.MIDNIGHT));
    System.out.println(localTime1.with(ChronoField.HOUR_OF_DAY, 3));

    System.out.println(localTime1.withHour(9));
  }
}
