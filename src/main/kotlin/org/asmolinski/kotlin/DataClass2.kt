package org.asmolinski.kotlin

import java.util.UUID

fun main() {
    println(aPerson1())
    println(aPerson1(firstName = "Jane"))
    println(aPerson1(firstName = "Kate", lastName = "Smith", age = 40))
}

data class Person1(
    val id: String,
    val firstName: String,
    val lastName: String,
    val age: Int
)

fun aPerson1(
    id: String = UUID.randomUUID().toString(),
    firstName: String = "John",
    lastName: String = "Doe",
    age: Int = 20
) = Person1(id, firstName, lastName, age)
