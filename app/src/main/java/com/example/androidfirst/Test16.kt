package com.example.androidfirst

fun main() {
    class NonDataClass(val name: String, val email: String, val age: Int)
    data class DataClass(val name: String, val email: String, val age: Int)

    val nonObj1 = NonDataClass("Kim", "Kim@naver", 20)
    val nonObj2 = NonDataClass("Kim", "Kim@naver", 20)
    val dataObj1 = DataClass("Kim", "Kim@naver", 20)
    val dataObj2 = DataClass("Kim", "Kim@naver", 20)

    println("nonObj1 == nonObj2 : ${nonObj1 == nonObj2}")
    println("nonObj1.equals(nonObj2) : ${nonObj1.equals(nonObj2)}")
    println("dataObj1 == dataObj2 : ${dataObj1 == dataObj2}")
    println("dataObj1.equals(dataObj2) : ${dataObj1.equals(dataObj2)}")
}