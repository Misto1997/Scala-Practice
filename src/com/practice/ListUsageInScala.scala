package com.practice

object ListUsageInScala {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4) //way to define predefined list in scala
    println(list)

    list.foreach { i: Int => print(i + " ") } //lambda expression in scala for list
    println()

    val a = list.reverse //reversing list
    println(a)
    println(list) //list is still same as list is immutable by default in scala

    val list1 = List(1, 2, "Hello") //list of type Any
    println(list1)

    case class student(var rollNo: Int, var name: String)
    val studentList = List(student(1, "Rahul"), student(2, "Vishal")) //list of student object
    println(studentList)

    val firstStudent = studentList.head //inbuilt method to print first element of list
    println(firstStudent)

    val lastStudent = studentList.tail
    println(lastStudent)

    val topper = studentList.filter(m => m.name.equals("Rahul")) //filter pipelining
    print(topper)

  }
}
