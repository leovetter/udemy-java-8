package com.learn.java.parallel_streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class ParallelStreamExample2 {

  public static void seqNamesAndActivities() {

    long startTime = System.currentTimeMillis();

    StudentDataBase.getAllStudents().stream()
        .map(Student::getActivities)
        .flatMap(List::stream)
        .distinct()
        .sorted()
        .collect(Collectors.toList());

    long endTime = System.currentTimeMillis();

    System.out.println(endTime - startTime);
  }

  public static void parNamesAndActivities() {

    long startTime = System.currentTimeMillis();

    StudentDataBase.getAllStudents().parallelStream()
        .map(Student::getActivities)
        .flatMap(List::stream)
        .distinct()
        .sorted()
        .collect(Collectors.toList());

    long endTime = System.currentTimeMillis();

    System.out.println(endTime - startTime);
  }

  public static void main(String[] args) {

    seqNamesAndActivities();
    parNamesAndActivities();
  }
}
