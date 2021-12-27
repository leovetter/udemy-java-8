package com.learn.java.functionnal_interfaces;

import java.util.List;
import java.util.function.BiConsumer;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class BiConsumerExample {

  public static void nameAndActivities() {

    BiConsumer<String, List<String>> nameAndAct =
        (name, activities) -> System.out.println("name : " + name + " activities : " + activities);

    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(student -> nameAndAct.accept(student.getName(), student.getActivities()));
  }

  public static void main(String[] args) {

    BiConsumer<String, String> bc = (str1, str2) -> System.out.println("str1 : " + str1 + " str2 : " + str2);

    bc.accept("Hello", "World");

    BiConsumer<Integer, Integer> multiply = (i1, i2) -> System.out.println("multiply : " + i1*i2);
    BiConsumer<Integer, Integer> division = (i1, i2) -> System.out.println("multiply : " + i1/i2);

    multiply.andThen(division).accept(10, 5);

    nameAndActivities();
  }
}
