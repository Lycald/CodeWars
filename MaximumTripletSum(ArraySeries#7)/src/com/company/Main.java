package com.company;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        System.out.println(maxTriSum(new int[]{-14,-12,-7,-42,-809,-14,-12}));
    }
    public static int maxTriSum (int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            set.add(numbers[i]);
        }
        Optional<Integer> sumSet = set.stream().sorted(Comparator.reverseOrder()).limit(3)
                .reduce((a, b) -> a + b);
        set.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
        return sumSet.isPresent() ? sumSet.get() : 0;
    }
}
