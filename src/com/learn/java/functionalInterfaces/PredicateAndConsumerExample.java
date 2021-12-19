package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;
    static BiPredicate<Integer, Double> bi1 = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3;
    static BiConsumer<String, List<String>> biCons = (name, activities) ->
            System.out.println("name : " + name + " activities : " + activities);

    static Consumer<Student> c1 = student -> {

        if(bi1.test(student.getGradeLevel(), student.getGpa())) {
            biCons.accept(student.getName(), student.getActivities());
        }
    };

    public static void printNameAndAtivities() {

        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(c1);
    }

    public static void main(String[] args) {

        printNameAndAtivities();
    }
}
