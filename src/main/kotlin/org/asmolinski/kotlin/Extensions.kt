package org.asmolinski.kotlin

import java.util.Random

fun String.isPalindrome() = this == this.reversed()

class MemberExtension(private val random: Random = Random()) {

    fun getString(s: String) = s.addRandomSuffix()

    private fun String.addRandomSuffix() = this + this@MemberExtension.random.nextInt()
}

fun main() {
    println("kajak".isPalindrome())
    println("łódka".isPalindrome())

    println(MemberExtension().getString("test"))
}

class DontDoThis(private val outerMember: String) {

    inner class PleaseDont(private val innerMember: String) {

        fun String.nopeNopeNope() {
            this + this@PleaseDont.innerMember + this@DontDoThis.outerMember
        }

//        fun DontDoThis.doesntWork() {
//            this@DontDoThis + this
//        }
    }
}

