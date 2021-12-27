package com.learn.java.parallel_streams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

  public static long checkPerf(Supplier<Integer> s, int nbOfTimes) {

    long startTime = System.currentTimeMillis();

    for (int i = 0; i < nbOfTimes; i++) {
      s.get();
    }

    long endTime = System.currentTimeMillis();

    return endTime - startTime;
  }

  public static int sum_seq() {

    return IntStream.range(0, 100000).sum();
  }

  public static int sum_par() {

    return IntStream.range(0, 100000).parallel().sum();
  }

  public static void main(String[] args) {

    System.out.println(sum_seq());
    System.out.println(sum_par());

    System.out.println(Runtime.getRuntime().availableProcessors());

    System.out.println(checkPerf(ParallelStreamExample::sum_seq, 2000));
    System.out.println(checkPerf(ParallelStreamExample::sum_par, 2000));
  }
}
