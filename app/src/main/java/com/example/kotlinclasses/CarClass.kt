package com.example.kotlinclasses

class CarClass {
    var model:String = "";
    var engineNumber:String = "";
    var timeToMaxSpeed:Int =0;

    //function
    fun reachMaxSpeed(distance:Int){
        println("This Car Reaches Max Speed in ${distance * timeToMaxSpeed} !")
    }

    fun printDetails(){
        println("Car is a Model :- $model having engine number $engineNumber !")
    }



}

fun main(){
    //creating object
    val audi = CarClass()
    // Accessing member variables
    audi.model="S4";
    audi.engineNumber="AD45";
    audi.timeToMaxSpeed=20;

    audi.reachMaxSpeed(40)

    print(audi)
    audi.printDetails()

    val toyota = CarClass()
    toyota.model="B432A"
    toyota.engineNumber="IO120S"
    toyota.timeToMaxSpeed=3

    toyota.reachMaxSpeed( distance = 10)

    print(toyota)
    toyota.printDetails()

    val ferrari = CarClass()
    ferrari.model="DCA102"
    ferrari.engineNumber="S012Q"
    ferrari.timeToMaxSpeed= 80

    ferrari.reachMaxSpeed(distance = 60)

    print(ferrari)
    ferrari.printDetails()

    val v8 = CarClass()
    v8.model="120TYR"
    v8.engineNumber="1542ArT"
    v8.timeToMaxSpeed= 35

    v8.reachMaxSpeed(distance = 20)

    print(v8)
    v8.printDetails()

}

