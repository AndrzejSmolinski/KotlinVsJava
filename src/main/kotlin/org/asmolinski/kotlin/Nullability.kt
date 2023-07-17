package org.asmolinski.kotlin

fun main() {
    println(stringFun()?.length)

    if (booleanFun() == true) {
        println("prawda")
    } else {
        println("fałsz")
    }
}

private fun booleanFun(): Boolean? {
    return null
}

private fun stringFun(): String? {
    return null
}