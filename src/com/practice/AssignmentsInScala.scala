package com.practice

object AssignmentsInScala {
  def main(args: Array[String]): Unit = { //main driving function same as java with no return type as Unit
    val a = 5 //normal declaration
    println(a)

    var b: Int = 5 //with data type
    b = 6
    println(b)

    val c: Int = 5 //constant
    //c=6;    //not possible as it is a constant
    println(c)

    var d: Unit = func() //assigning method to variable

    val e: String = "hello" //string type variable
    println(e + a)
    println(a + e)
    println(a.+(e)) //to show + is function not a operator

  }


  def func(): Unit = { //method
    println("hey")
  }

}

