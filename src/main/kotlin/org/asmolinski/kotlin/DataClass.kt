package org.asmolinski.kotlin

fun main() {
    val person = Person("Andrzej", "Smoliński", 33)
    val person1 = Person(firstName = "Andrzej", lastName = "Smoliński", age = 33)
    println("firstName: ${person.firstName}")
    println("lastName: ${person.lastName}")
    println("age: ${person.age}")
    println("equals: ${person == person1}")
    println("ref eq: ${person === person1}")
    println(person)

    val person2 = person.copy(firstName = "Andrzejek", age = 3)
    println(person2)
}

data class Person(val firstName: String, val lastName: String, val age: Int)