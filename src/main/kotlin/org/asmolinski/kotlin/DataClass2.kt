package org.asmolinski.kotlin

import java.util.UUID

fun main() {
    println(Person1())
    println(Person1(firstName = "Jane"))
    println(Person1(firstName = "Kate", lastName = "Smith", age = 40))
}

data class Person1(
    val id: String = UUID.randomUUID().toString(),
    val firstName: String = "John",
    val lastName: String = "Doe",
    val age: Int = 20
)