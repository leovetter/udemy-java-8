package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
        Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

        Map<String, List<String>> namesAndActivities = StudentDataBase.getAllStudents().stream()
                .filter(p1)
                .filter(p2)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(namesAndActivities);
    }
}
