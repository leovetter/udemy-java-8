package com.learn.java.defaults;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultExample {

  public static void main(String[] args) {

    List<String> names = Arrays.asList("Mike", "James", "Adam", "Rachelle", "Lucille");

    /**
     * Prior Java 8
     */
    Collections.sort(names);
    System.out.println(names);

    /**
     * Java 8
     */
    names.sort(Comparator.naturalOrder());
    System.out.println(names);

    names.sort(Comparator.reverseOrder());
    System.out.println(names);
  }
}
