package com.homework.h05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i< 100; i++) {
            // 0.0 <= random < 1.0
            int n = (int) (Math.random() * 99 + 1);
            numbers.add(n);
        }
        System.out.println("----- getEven -----");
        getEven(numbers)
                .forEach(System.out::println);
        System.out.println("----- getOdd -----");
        getOdd(numbers)
                .forEach(System.out::println);
        System.out.println("----- getTriple -----");
        getTriple(numbers)
                .forEach(System.out::println);
        System.out.println("----- getReverseSorted -----");
        getReverseSorted(numbers)
                .forEach(System.out::println);
    }

    private static List<Integer> getEven(List<Integer> nums) {
        return nums.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
    }
    private static List<Integer> getOdd(List<Integer> nums) {
        return nums.stream()
                .filter(i -> i < 30)
                .filter(i -> i % 2 == 1)
                .collect(Collectors.toList());
    }
    private static List<Integer> getTriple(List<Integer> nums) {
        return nums.stream()
                .filter(i -> i % 3 == 0)
                .map(i -> i * 1000)
                .collect(Collectors.toList());
    }

    private static List<Integer> getReverseSorted(List<Integer> nums) {
        return nums.stream()
                .filter(i -> i % 3 == 0)
                .map(i -> i * 1000)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
