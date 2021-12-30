package com.learn.java.optional;

import java.util.Optional;

import com.learn.java.data.Bike;
import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class optionalMapFlatMapExample {

  public static Optional<String> filterMap() {

    Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());

    return student.filter(s -> s.getGpa() >= 3).map(Student::getName);
  }

  public static Optional<String> flatMap() {

    Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());

    return student.filter(s -> s.getGpa() >= 3).flatMap(Student::getBike).map(Bike::getName);
  }

  public static void main(String[] args) {

    filterMap().ifPresent(System.out::println);
    flatMap().ifPresent(System.out::println);
  }
}
