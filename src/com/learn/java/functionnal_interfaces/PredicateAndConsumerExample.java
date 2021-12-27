package com.learn.java.functionnal_interfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class PredicateAndConsumerExample {

  static BiConsumer<String, List<String>> nameAndAct =
      (name, activities) -> System.out.println("name : " + name + " activities : " + activities);

  static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3 && s.getGpa() >= 3.9;

  static Consumer<Student> c1 = (s) -> {

    if(p1.test(s)) {
      nameAndAct.accept(s.getName(), s.getActivities());
    }
  };


  public static void printNameAndActivities() {

    List<Student> studentList = StudentDataBase.getAllStudents();

    studentList.forEach(s -> nameAndAct.accept(s.getName(), s.getActivities()));
  }

  public static void main(String[] args) {

    printNameAndActivities();
  }
}
