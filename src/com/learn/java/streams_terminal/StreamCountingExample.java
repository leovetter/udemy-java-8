package com.learn.java.streams_terminal;

import java.util.stream.Collectors;

import com.learn.java.data.StudentDataBase;

public class StreamCountingExample {

  public static Long count_1() {

    return StudentDataBase.getAllStudents().stream()
        .collect(Collectors.counting());
  }

  public static Long count_2() {

    return StudentDataBase.getAllStudents().stream()
        .count();
  }

  public static void main(String[] args) {

    System.out.println(count_1());
    System.out.println(count_2());
  }
}
