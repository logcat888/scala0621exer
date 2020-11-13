package com.atguigu.scala.chapter06.dogcase

/**
 * @author chenhuiup
 * @create 2020-09-13 19:06
 */
object DogCaseTest {
  def main(args: Array[String]): Unit = {
    val dog = new DogCase
    dog.name = "uzi"
    dog.age = 18
    dog.weight = 250
    println(dog.say())
    println(dog) //com.atguigu.scala.chapter06.dogcase.DogCase@66d33a
  }

}

class DogCase {
  var name: String = _
  var age: Int = _
  var weight: Double = _

  def say() = {
    "Dog: Name = " + name + ",age = " + age + ",weight = " + weight
  }
}