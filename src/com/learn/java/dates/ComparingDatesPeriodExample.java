package com.learn.java.dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {

  public static void main(String[] args) {

    LocalDate localDate1 = LocalDate.now();
    LocalDate localDate2 = LocalDate.of(2018, 7, 12);

    Period period1 = localDate2.until(localDate1);
    System.out.println(period1);
    System.out.println(period1.getYears());
    System.out.println(period1.getMonths());
    System.out.println(period1.getDays());

    Period period2 = Period.ofDays(5);
    System.out.println(period2);

    Period period3 = Period.ofYears(2056);
    System.out.println(period3);
    System.out.println(period3.toTotalMonths());

    Period period4 = Period.between(localDate1, localDate2);
    System.out.println(period4);


  }
}
