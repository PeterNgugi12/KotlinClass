package com.example.kotlinclasses.methodoverloading

class Arithematic {
    fun add(num1:Int, num2:Int){
        println("sum of the two numbers:${num1 + num2}")
    }
    fun add(num1:Int, num2:Int, num3:Int){
        println("sum of the three numbers: ${num1 + num2 + num3}")
    }
    fun add(num1:Double, num2:Double){
        println("sum of two numbers: ${num1 + num2}")
    }

}