package com.learn.java.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

  public static void main(String[] args) {

    LocalDate localDate1 = LocalDate.now();
    System.out.println(localDate1);

    LocalDate localDate2 = LocalDate.of(2018, 7, 5);
    System.out.println(localDate2);

    LocalDate localDate3 = LocalDate.ofYearDay(2018, 365);
    System.out.println(localDate3);

    System.out.println(localDate1.getMonth());
    System.out.println(localDate1.getMonthValue());
    System.out.println(localDate1.getDayOfWeek());
    System.out.println(localDate1.getDayOfYear());
    System.out.println(localDate1.get(ChronoField.DAY_OF_MONTH));

    System.out.println(localDate1.plusDays(2));
    System.out.println(localDate1.plusMonths(2));
    System.out.println(localDate1.minusDays(2));
    System.out.println(localDate1.withYear(1995));
    System.out.println(localDate1.with(ChronoField.MONTH_OF_YEAR, 5));
    System.out.println(localDate1.with(TemporalAdjusters.lastDayOfMonth()));
    System.out.println(localDate1.minus(6, ChronoUnit.DECADES));

    System.out.println(localDate1.isLeapYear());
    System.out.println(localDate1.isEqual(localDate2));
    System.out.println(localDate1.isAfter(localDate2));
  }
}
