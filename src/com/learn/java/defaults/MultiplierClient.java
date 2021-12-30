package com.learn.java.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

  public static void main(String[] args) {

    MultiplierImpl multi = new MultiplierImpl();

    List<Integer> integers = Arrays.asList(5, 6, 7);

    System.out.println(multi.multiply(integers));
    System.out.println(multi.size(integers));
    System.out.println(Multiplier.isNotEmpty(integers));
  }

}
