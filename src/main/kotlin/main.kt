package ru.netology

fun main () {
    val amount: Int = 1000000
    val perCommission: Float = 0.75F
    val limit: Int = 35
    val totalCommission: Float = amount * perCommission / 100
    val result = if (totalCommission < limit) limit else totalCommission
    println("Комиссия составит: $result рублей")
}