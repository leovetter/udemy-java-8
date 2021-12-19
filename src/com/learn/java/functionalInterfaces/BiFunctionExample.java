package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> f1 = (students, p1) -> {

        Map<String, Double> studentsAndGrade = new HashMap<String, Double>();
        students.forEach(student -> {
            if(p1.test(student)) {

                studentsAndGrade.put(student.getName(), student.getGpa());
            }
        });

        return studentsAndGrade;
    };

    public static void main(String[] args) {

        System.out.println(f1.apply(StudentDataBase.getAllStudents(), PredicateAndConsumerExample.p1));
    }
}
