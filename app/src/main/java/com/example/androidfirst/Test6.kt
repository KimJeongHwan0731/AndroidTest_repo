package com.example.androidfirst

fun main() {
    //내부함수
    fun sum(no: Int): Int {
        var sum = 0
        for (i in 0 .. no) {
            sum += i
        }
        var sum2 = 0
        for (i in 0 .. no step 2) {
            sum2 += i
        }
        return sum
        return sum2

    }
    //지역변수
    val name: String = "Hong Gil Dong"
    println("name = $name")
    println(sum(10))
//    println(sum2(10))
}

fun add(): Unit{
//    var value = sum(10)
}