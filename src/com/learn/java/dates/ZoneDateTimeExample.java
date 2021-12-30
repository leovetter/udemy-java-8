package com.learn.java.dates;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeExample {

  public static void main(String[] args) {

    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println(zonedDateTime);
    System.out.println(zonedDateTime.getOffset());
    System.out.println(zonedDateTime.getZone());

//    ZoneId.getAvailableZoneIds().stream()
//        .forEach(System.out::println);

    System.out.println(ZonedDateTime.now(ZoneId.of("America/Chicago")));
    System.out.println(ZonedDateTime.now(ZoneId.of("America/Detroit")));
    System.out.println(ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));

    System.out.println(LocalDateTime.now(ZoneId.of("America/Chicago")));
    System.out.println(LocalDateTime.now(Clock.system(ZoneId.of("America/Chicago"))));

    System.out.println(LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));

    /**
     * Convert LocalDateTime and Instant to ZoneDateTime
     */

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    ZonedDateTime zonedDateTime1 = localDateTime.atZone(ZoneId.of("America/Chicago"));
    System.out.println(zonedDateTime1);

    ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("America/Chicago"));
    System.out.println(zonedDateTime2);
  }
}
