package org.asmolinski.kotlin

object Singleton {
    const val VALUE = 1234

    fun valueAsString() = VALUE.toString()

}

interface Greetable {
    fun hello(): String
}

val anonymous = object: Greetable {
    override fun hello() = "I have no name"
}

class ClassWithCompanion() {
    fun getPrivateConstant() = PRIVATE_CONSTANT

    companion object {
        const val COMPANION_CONSTANT = 4321
        private const val PRIVATE_CONSTANT = 1111
    }
}

fun main() {
    println("singleton value = " + Singleton.VALUE)
    println("singleton value as string = " + Singleton.valueAsString())

    println("anon objects says: " + anonymous.hello())

    println("companion value = " + ClassWithCompanion.COMPANION_CONSTANT)
    println("companion private value = " + ClassWithCompanion().getPrivateConstant())
    // not allowed
    // println("companion private value = " + ClassWithCompanion.PRIVATE_CONSTANT)
}