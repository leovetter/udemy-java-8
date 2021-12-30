package com.learn.java.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

  public static void parseLocalDate() {

    String date = "2018-04-12";
    LocalDate localDate = LocalDate.parse(date);
    System.out.println(localDate);

    LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
    System.out.println(localDate1);

    String date1 = "20180428";
    LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
    System.out.println(localDate2);

    String date3 = "2016|04|21";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
    LocalDate localDate3 = LocalDate.parse(date3, dateTimeFormatter);
    System.out.println(localDate3);
  }

  public static void formatDate() {

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
    LocalDate localDate = LocalDate.now();
    String formattedDate = localDate.format(dateTimeFormatter);
    System.out.println(formattedDate);
  }

  public static void main(String[] args) {

    parseLocalDate();
    formatDate();
  }
}
