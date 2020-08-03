package com.practice

case class CaseClassPractice(var string: String) { //case class example with constructor

  def func(): Unit = println("test function") //method inside class

  def func1(): Int = { //with return type Int
    8 + 10
  }

  def func2(num: Int): Int = { //parameterized method
    num + 10
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val c = CaseClassPractice("Test") //assignment class object to variable
    println(c) //print variable
    c.func() //calling class method
    println(c.func1()) //calling method
  }
}
