package com.learn.java.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class Default2Example {

  static Consumer<Student> studentConsumer = System.out::println;
  static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
  static Comparator<Student> gradeComparator = Comparator.comparingDouble(Student::getGradeLevel);

  public static void sortByName(List<Student> students) {

    students.sort(nameComparator);

    System.out.println("After name sort");
    students.forEach(studentConsumer);
  }

  public static void sortByGrade(List<Student> students) {

    students.sort(gradeComparator);

    System.out.println("After grade sort");
    students.forEach(studentConsumer);
  }

  public static void chainingSort(List<Student> students) {

    students.sort(gradeComparator.thenComparing(nameComparator));
    System.out.println("After chaining sort");
    students.forEach(studentConsumer);
  }

  public static void sortWithNullValue(List<Student> students) {

    Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
    students.sort(studentComparator);
    students.forEach(studentConsumer);
  }

  public static void main(String[] args) {

    List<Student> students = StudentDataBase.getAllStudents();
    System.out.println("Before sort");
    students.forEach(studentConsumer);

//    sortByName(students);
//    sortByGrade(students);
//    chainingSort(students);

    sortWithNullValue(students);
  }
}

