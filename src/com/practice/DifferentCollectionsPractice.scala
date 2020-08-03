package com.practice

object DifferentCollectionsPractice {

  def main(args: Array[String]): Unit = {
    val arr = Array(10, 20, 30, 40) //Array Example
    println(arr.mkString(" "))
    println(arr(1))
    println(arr.length)
    arr.filter(i => i > 10).foreach(i => println(i + " "))

    val arr1: Array[Int] = new Array[Int](10)
    println(arr1.mkString(" "))

    val arr2 = arr.clone()
    arr2(1) = 5
    println(arr2.mkString(" "))

    println(arr1.concat(arr2).mkString(" "))


    val vec: Vector[Int] = Vector(1, 2, 4, 5) //Vector
    println(vec.mkString(" "))


    val range = 1 to 10 //Range
    println(range)
    range.foreach(i => print(i + " "))
    println()

    val map = Map(1 -> "rahul", 2 -> "rohit") //Map
    println(map)
    println(map.keys)
    println(map.values)
    println(map.get(1))
    println(map.get(3))
    println(map.getOrElse(4, "not present"))

  }

}
