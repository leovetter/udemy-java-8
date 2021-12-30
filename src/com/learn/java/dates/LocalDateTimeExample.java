package com.learn.java.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

  public static void main(String[] args) {

    LocalDateTime localDateTime1 = LocalDateTime.now();
    System.out.println(localDateTime1);

    LocalDateTime localDateTime2 = LocalDateTime.of(2018, 11, 5, 15, 32, 22, 85239);
    System.out.println(localDateTime2);

    System.out.println(localDateTime1.getHour());
    System.out.println(localDateTime1.getDayOfMonth());
    System.out.println(localDateTime1.getMonthValue());
    System.out.println(localDateTime1.get(ChronoField.CLOCK_HOUR_OF_DAY));

    System.out.println(localDateTime1.plusHours(5));
    System.out.println(localDateTime1.minusDays(5));
    System.out.println(localDateTime1.withHour(6));

    LocalDate localDate = LocalDate.now();
    System.out.println(localDate.atTime(4, 6, 5, 4596));

    LocalTime localTime = LocalTime.now();
    System.out.println(localTime.atDate(LocalDate.now()));

    System.out.println(localDateTime1.toLocalDate());
    System.out.println(localDateTime1.toLocalTime());
  }
}
