package com.learn.java.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateLocalDateExample {

  public static void main(String[] args) {

    /**
     * java.util.date to LocalDate
     */
    Date date = new Date();
    System.out.println(date);

    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    System.out.println(localDate);

    Date date1 = new Date().
        from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
    System.out.println(date1);

    /**
     * java.sql.date to LocalDate
     */
    java.sql.Date date2 = java.sql.Date.valueOf(localDate);
    System.out.println(date2);

    LocalDate localDate1 = date2.toLocalDate();
    System.out.println(localDate1);
  }
}
