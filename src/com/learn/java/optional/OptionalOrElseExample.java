package com.learn.java.optional;

import java.util.Optional;

import com.learn.java.data.Student;

public class OptionalOrElseExample {

  public static String orElse() {

    Optional<Student> student = Optional.ofNullable(null);

    return student.map(Student::getName).orElse("Default");
  }

  public static String orElseGet() {

    Optional<Student> student = Optional.ofNullable(null);

    return student.map(Student::getName).orElseGet(() -> "Default");
  }

  public static String orElseThrow() {

    Optional<Student> student = Optional.ofNullable(null);

    return student.map(Student::getName).orElseThrow(() -> new RuntimeException(""
        + "Data not available"));
  }

  public static void main(String[] args) {

    System.out.println(orElse());
    System.out.println(orElseGet());
    System.out.println(orElseThrow());
  }
}
