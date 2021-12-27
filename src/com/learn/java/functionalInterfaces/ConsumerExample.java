package com.learn.java.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class ConsumerExample {

  static Consumer<Student> c2 = (student) -> System.out.println(student);
  static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
  static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

  public static void printStudents() {

    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(c2);
  }

  public static void printNamesAndActivities() {

    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(c3.andThen(c4)); // Consumer chaining
  }

  public static void printNamesAndActivitiesUsingCondition() {

    System.out.println("printNamesAndActivitiesUsingCondition");
    Consumer<Student> c3 = (student) -> System.out.print(student.getName());
    Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(student -> {
      if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
        c3.andThen(c4).accept(student);
      }
    });
  }

  public static void main(String[] args) {

    Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

    c1.accept("java 8");

    printStudents();
    printNamesAndActivities();
    printNamesAndActivitiesUsingCondition();
  }
}
