package com.learn.java.streams_terminal;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamGroupingByExample {

  public static Map<String, List<Student>> groupBy() {

    return StudentDataBase.getAllStudents().stream()
        .collect(Collectors.groupingBy(Student::getGender));
  }

  public static Map<String, List<Student>> customGroupBy() {

    return StudentDataBase.getAllStudents().stream()
        .collect(Collectors.groupingBy(s -> s.getGpa() >= 3.8 ? "OUTSDANDING" : "AVERAGE"));
  }

  public static Map<String, Map<String, List<Student>>> twoLevelGroupBy() {

    return StudentDataBase.getAllStudents().stream()
        .collect(
            Collectors.groupingBy(Student::getGender,
                Collectors.groupingBy(s -> s.getGpa() >= 3.8 ? "OUTSDANDING" : "AVERAGE")));
  }

  public static Map<Double, Integer> twoLevelGroupBy2() {

    return StudentDataBase.getAllStudents().stream()
        .collect(
            Collectors.groupingBy(Student::getGpa,
                Collectors.summingInt(Student::getGradeLevel)));
  }

  public static LinkedHashMap<String, Set<Student>> threeArgumentsGroupBy() {

    return StudentDataBase.getAllStudents().stream()
        .collect(Collectors.groupingBy(Student::getGender, LinkedHashMap::new, Collectors.toSet()));
  }

  public static Map<Integer, Optional<Student>> topGpa() {

    return StudentDataBase.getAllStudents().stream()
        .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.maxBy(Comparator.comparing(Student::getGpa))));
  }

  public static Map<Integer, Student> topGpa2() {

    return StudentDataBase.getAllStudents().stream()
        .collect(Collectors.groupingBy(Student::getGradeLevel,
            Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
  }

  public static void main(String[] args) {

    System.out.println(groupBy());
    System.out.println(customGroupBy());
    System.out.println(twoLevelGroupBy());
    System.out.println(twoLevelGroupBy2());
    System.out.println(threeArgumentsGroupBy());
    System.out.println(topGpa());
    System.out.println(topGpa2());
  }
}
