package com.learn.java.streams;

import java.util.Optional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamFindAnyFirstExample {

  public static Optional<Student> findAny() {

    return StudentDataBase.getAllStudents().stream()
        .filter(s -> s.getGpa() >= 3.9)
        .findAny();
  }

  public static Optional<Student> findFirst() {

    return StudentDataBase.getAllStudents().stream()
        .filter(s -> s.getGpa() >= 3.9)
        .findFirst();
  }

  public static void main(String[] args) {

    System.out.println(findAny());
    System.out.println(findFirst());
  }
}
