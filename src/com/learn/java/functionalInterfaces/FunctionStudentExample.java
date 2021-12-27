package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;
import com.learn.java.functionalInterfaces.PredicateAndConsumerExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> f1 = (students) -> {

        Map<String, Double> studentsAndGrade = new HashMap<String, Double>();
        students.forEach(student -> {
            if(PredicateAndConsumerExample.p1.test(student)) {

                studentsAndGrade.put(student.getName(), student.getGpa());
            }
        });

        return studentsAndGrade;
    };

    public static void main(String[] args) {

        System.out.println(f1.apply(StudentDataBase.getAllStudents()));
    }
}
