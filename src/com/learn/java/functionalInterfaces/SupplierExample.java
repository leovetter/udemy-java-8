package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Student> s1 = () -> new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
        System.out.println("One student is " + s1.get());

        Supplier<List<Student>> s2 = () -> StudentDataBase.getAllStudents();
        System.out.println("All students are " + s2.get());
    }
}
