package com.learn.java.dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {

  public static void parseLocalTime() {

    String time = "13:00";
    LocalTime localTime = LocalTime.parse(time);
    System.out.println(time);

    LocalTime localTime1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
    System.out.println(localTime1);

    /**
     * Custom format
     */
    String time1 = "17*00";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");
    LocalTime localTime2 = LocalTime.parse(time1,  dateTimeFormatter);
    System.out.println(localTime2);

    String time2 = "17*00*32";
    DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HH*mm*ss");
    LocalTime localTime3 = LocalTime.parse(time2,  dateTimeFormatter2);
    System.out.println(localTime3);
  }

  public static void formatLocalTime() {

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm*ss");
    LocalTime localTime = LocalTime.now();
    String formattedTime = localTime.format(dateTimeFormatter);
    System.out.println(formattedTime);
  }

  public static void main(String[] args) {

    parseLocalTime();
    formatLocalTime();
  }
}
