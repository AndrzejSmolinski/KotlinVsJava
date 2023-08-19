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
}

fun squaresOfEvenInts(ints: List<Int>) =
    ints
        .filter { it % 2 == 0 }
        .map { it * it }

fun partitionOddVsEven(ints: List<Int>) =
    ints.partition { it % 2 == 0 }