package org.asmolinski.kotlin

fun main() {
    // map + filter
    println(squaresOfEvenInts(listOf(1, 2, 3, 4, 5, 6)))

    // partition
    val (even, odd) = partitionOddVsEven(listOf(1, 2, 3, 4, 5, 6))
    println("Parzyste: $even")
    println("Nieparzyste: $odd")

    // java interoperability
    val fromJava = org.asmolinski.java.Collections.squaresOfEvenInts(listOf(1, 2, 3, 4, 5, 6))
    println(fromJava)
    println("Suma " + fromJava.sum())

    // sequence
    println(sequenceProcessing(listOf(1, 2, 3, 4, 5, 6)))
}

fun squaresOfEvenInts(ints: List<Int>) =
    ints
        .filter { it % 2 == 0 }
        .map { it * it }

fun partitionOddVsEven(ints: List<Int>) =
    ints.partition { it % 2 == 0 }

fun sequenceProcessing(ints: List<Int>) =
    ints.asSequence()
        .map { it * it }
        .mapIndexed { index, value ->  if (index % 2 == 0) value + 1 else value }
        .shuffled()
        .sum()