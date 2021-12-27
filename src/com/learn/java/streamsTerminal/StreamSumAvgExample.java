package com.learn.java.streamsTerminal;

import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamSumAvgExample {

  public static Integer sum() {

    return StudentDataBase.getAllStudents().stream()
        .collect(Collectors.summingInt(Student::getGradeLevel));
  }

  public static Double avg() {

    return StudentDataBase.getAllStudents().stream()
        .collect(Collectors.averagingInt(Student::getGradeLevel));
  }

  public static void main(String[] args) {

    System.out.println(sum());
    System.out.println(avg());
  }
}
