package org.asmolinski.java;

import org.asmolinski.kotlin.CollectionsKt;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;

public class Collections {

    public static void main(String[] args) {
        // map + filter
        System.out.println(squaresOfEvenInts(List.of(1, 2, 3, 4, 5, 6)));

        // partition
        final var partitioned = partitionOddVsEven(List.of(1, 2, 3, 4, 5, 6));
        System.out.println("Parzyste: " + partitioned.get(true));
        System.out.println("Nieparzyste: " + partitioned.get(false));

        // kotlin interoperability
        final var fromKotlin = CollectionsKt.squaresOfEvenInts(List.of(1, 2, 3, 4, 5, 6));
        System.out.println(CollectionsKt.squaresOfEvenInts(List.of(1, 2, 3, 4, 5, 6)));
        System.out.println("Suma " + fromKotlin.stream().mapToInt(it -> it).sum());
    }

    public static List<Integer> squaresOfEvenInts(List<Integer> input) {
        return input.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .collect(toList());
    }

    private static Map<Boolean, List<Integer>> partitionOddVsEven(List<Integer> input) {
        return input.stream()
                .collect(partitioningBy(i -> i % 2 == 0));
    }

}
