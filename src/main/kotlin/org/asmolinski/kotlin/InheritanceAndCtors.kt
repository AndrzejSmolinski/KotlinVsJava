package org.asmolinski.kotlin

import kotlin.random.Random
import java.time.Instant

class ClassicStyle {
    private val member: String

    constructor(member: String) {
        this.member = member
    }
}

class KotlinStyle(private val member: String)

class SecondaryCtorAndInitBlock(val createdAt: Instant, val value: String) {
    constructor(value: String): this(Instant.now(), value) {
        println("odpalam secondary konstruktor")
    }

    private val liczbaLosowa: Int

    init {
        println("Inicjalizacja!!!!!")
        liczbaLosowa = Random.nextInt()
    }
}

fun main() {
    SecondaryCtorAndInitBlock("wartość")
}

// Kotlin classes are "final" by default!
class Closed

open class Open

// not allowed!
// open data class OpenDataClass(val foo: String)

abstract class Abstract

interface Iface

class Derived: Open(), Iface

abstract class WithStringMember(val member: String)

class WithIntAndStringMember(stringMember: String, val intMember: Int): WithStringMember(stringMember)

fun demo() {
    val test = WithIntAndStringMember("jeden", 1)
    test.intMember
    test.member
}