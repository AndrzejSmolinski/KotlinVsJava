package org.asmolinski.kotlin

import kotlin.random.Random

fun main() {
    // "it" in lambda, ignore lambda result
    val alsoResult: Int = (2 + 2).also { println(it) }
    // "this" in lambda, ignore lambda result
    val applyResult: Int = (2 + 2).apply { println(this) }
    // "it" in lambda, return lambda result
    val letResult: String = (2 + 2).let { it.toString() }
    // "this" in lambda, return lambda result
    val runResult: String = (2 + 2).run { this.toString() }

    // non extension, "this" in lambda, return lambda result
    val withResult = with (2 + 2) {
        println(this)
    }
}

// idioms

// we want to return a value but "also" do something with it
fun whenToUseAlso(): Int {
    return (2 + 2).also { println(it) }
}

// "let" is somewhat synonym to "map" for optionals
fun whenToUseLet(): Int {
    val maybeNull = if (Random.nextBoolean()) 2 else null
    return maybeNull?.let { it + 2 } ?: 0
}

fun iLikeImperative(): Int? {
    val int = Random.nextInt()
    return if (int % 2 == 0) {
        int * 2
    } else {
        null
    }
}

fun iLikeFunctional(): Int? = Random.nextInt().takeIf { it % 2 ==0 }?.let { it * 2 }

// "with" is useful for mappers and assertions
data class FulfilmentOffer(
    val offerId: String,
    val sellerId: String,
    val fulfilmentProductId: String
)

data class Offer(
    val id: String,
    val sellerId: String,
    val productId: String,
)

fun map(offer: Offer): FulfilmentOffer = with(offer) {
    FulfilmentOffer(
        offerId = id,
        sellerId = sellerId,
        fulfilmentProductId = productId
    )
}

fun mapNoWith(offer: Offer): FulfilmentOffer =
    FulfilmentOffer(
        offerId = offer.id,
        sellerId = offer.sellerId,
        fulfilmentProductId = offer.productId
    )