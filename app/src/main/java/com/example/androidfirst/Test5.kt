package com.example.androidfirst

val a51: Byte = 0b00001011
val a52: Int = 123
val a53: Short = 123
val a54: Long = 10L
val a55: Float = 10F
val a56: Boolean = true
val a57: Char = 'A'
val a58: String = "A"

fun main() {
    if(a57 == 'A') {
        println("true")
    } else {
        println("false")
    }

    val str2 = """ 
            Hello
            world
    """.trimIndent()
    println(str2)
}