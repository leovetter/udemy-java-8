package com.learn.java.streams_terminal;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamMinByMaxByExample {

  public static Optional<Student> min_by() {

    return StudentDataBase.getAllStudents().stream()
        .collect(Collectors.minBy(Comparator.comparing(Student::getGradeLevel)));
  }

  public static Optional<Student> max_by() {

    return StudentDataBase.getAllStudents().stream()
        .collect(Collectors.maxBy(Comparator.comparing(Student::getGradeLevel)));
  }

  public static void main(String[] args) {

    System.out.println(min_by());
    System.out.println(max_by());
  }
}
