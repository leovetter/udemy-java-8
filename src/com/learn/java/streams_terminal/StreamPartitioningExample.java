package com.learn.java.streams_terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamPartitioningExample {

  public static Map<Boolean, List<Student>> partitionBy1() {

    Predicate<Student> p1 = s -> s.getGpa() >= 3.7;

    return StudentDataBase.getAllStudents().stream()
        .collect(Collectors.partitioningBy(p1));
  }

  public static Map<Boolean, Set<Student>> partitionBy2() {

    Predicate<Student> p1 = s -> s.getGpa() >= 3.7;

    return StudentDataBase.getAllStudents().stream()
        .collect(Collectors.partitioningBy(p1, Collectors.toSet()));
  }

  public static void main(String[] args) {

    System.out.println(partitionBy1());
    System.out.println(partitionBy2());
  }
}
