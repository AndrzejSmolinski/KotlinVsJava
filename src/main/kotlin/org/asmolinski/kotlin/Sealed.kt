package org.asmolinski.kotlin

import kotlin.random.Random

sealed interface Season

class Spring: Season {
    fun blossom() = println("kwitnie")
}
class Summer: Season {
    fun heat() = println("upał")
}
class Autumn: Season {
    fun rain() = println("deszcz")
}
class Winter: Season {
    fun snow() = println("śnieg")
}

fun main() {
    val season = when (Random.nextInt(4)) {
        0 -> Spring()
        1 -> Summer()
        2 -> Autumn()
        else -> Winter()
    }

    when(season) {
        is Spring -> season.blossom()
        is Summer -> season.heat()
        is Autumn -> season.rain()
        is Winter -> season.snow()
    }
}
