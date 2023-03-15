package com.example.androidfirst

//val addValue:()->Int = {10 + 20}
//
//fun sum(addValue:()->Int): Unit{
//    println("합계는 = ${addValue()}")
//}

//val sum(no1 : Int) : Unit{
//    var no2 = 20
//    println("sum = no1 + no2")
//    println("합계는 = ${no2}")
//}


val addValue = {10 + 30 }

val sum = {no1: Int ->
    var no2 = 20
    println("sum = no1 + no2")
    println("합계는 = ${no1 + no2}")
}

//typealias MyFun = (Int) -> Unit
//val sum:MyFun = {
//    var no2 = 20
//    println("no1 = ${it} no2 = ${no2}")
//    println("합계는 = ${it + no2}")
//}

fun main() {
    addValue
    (addValue)
}