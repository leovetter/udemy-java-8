package com.learn.java.streams;

import com.learn.java.data.StudentDataBase;

public class StreamMatchExample {

  public static boolean allMatch() {

    return StudentDataBase.getAllStudents().stream()
        .allMatch(s -> s.getGpa() >= 3.9);
  }

  public static boolean anyMatch() {

    return StudentDataBase.getAllStudents().stream()
        .anyMatch(s -> s.getGpa() >= 3.9);
  }

  public static boolean noneMatch() {

    return StudentDataBase.getAllStudents().stream()
        .noneMatch(s -> s.getGpa() >= 3.9);
  }

  public static void main(String[] args) {

    System.out.println("Result of all match : " + allMatch());
    System.out.println("Result of any match : " + anyMatch());
    System.out.println("Result of none match : " +  noneMatch());
  }
}
