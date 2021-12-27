package com.learn.java.streams_terminal;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamMappingExample {

  public static List<String> mapping_1() {

    return StudentDataBase.getAllStudents().stream()
        .collect(Collectors.mapping(Student::getName, Collectors.toList()));
  }

  public static Set<String> mapping_2() {

    return StudentDataBase.getAllStudents().stream()
        .collect(Collectors.mapping(Student::getName, Collectors.toSet()));
  }

  public static List<String> mapping_3() {

    return StudentDataBase.getAllStudents().stream()
        .map(Student::getName)
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {

    System.out.println(mapping_1());
    System.out.println(mapping_2());
    System.out.println(mapping_3());
  }
}
