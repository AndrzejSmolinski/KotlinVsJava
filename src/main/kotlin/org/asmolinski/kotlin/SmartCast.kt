package org.asmolinski.kotlin

import kotlin.random.Random

fun main() {
    val maybeNull: String? = if (Random.nextBoolean()) null else "nie null"
    if (maybeNull != null) {
        iDontAcceptNull(maybeNull)
    } else {
        println("maybeNull is null :(")
    }

    val intOrString: Any = if (Random.nextBoolean()) "string" else 123
    if (intOrString is String) {
        println("string len ${intOrString.length}")
    } else if (intOrString is Int) {
        println("number + 1 ${intOrString + 1}")
    }
}

fun iDontAcceptNull(notNull: String) {
    println("$notNull is not null")
}
