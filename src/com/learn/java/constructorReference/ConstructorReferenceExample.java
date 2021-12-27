package com.learn.java.constructorReference;

import com.learn.java.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    static Supplier<Student> s1 = Student::new;
    static Function<String, Student> s2 = Student::new;

    public static void main(String[] args) {

        System.out.println(s1.get());
        System.out.println(s2.apply("ABS"));
    }
}
