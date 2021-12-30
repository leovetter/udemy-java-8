package com.learn.java.optional;

import java.util.Optional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class OptionalExample {

  public static String getStudentName() {

    Student student = StudentDataBase.studentSupplier.get();

    if(student != null) {
      return student.getName();
    }

    return null;
  }

  public static Optional<String> getStudentNameOptional() {

    Optional<Student> studentOpt = Optional.ofNullable(StudentDataBase.studentSupplier.get());

    if(studentOpt.isPresent()) {
      return studentOpt.map(Student::getName);
    }

    return Optional.empty();
  }

  public static void main(String[] args) {

    String name = getStudentName();

    if (name != null)
      System.out.println(name);
    else
      System.out.println("name not found");

    Optional<String> nameOpt = getStudentNameOptional();

    if (nameOpt.isPresent())
      System.out.println(nameOpt.get());
    else
      System.out.println("name not found");
  }
}
