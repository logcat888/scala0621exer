package com.atguigu.scala.chapter07.myextends

/**
 * @author chenhuiup
 * @create 2020-09-17 22:14
 */
object AbstractDemo01 {
  def main(args: Array[String]): Unit = {
    //默认情况下，一个抽象类是不能实例化的，但是可以通过匿名子类的方式实例化
    val animal = new Animal03 {
      override def sayHello(): Unit = {
        println("say hello")
      }

      override var food: String = "llll"
    }

    animal.sayHello()
  }
}

abstract class Animal02{
  // 在抽象类中可以有实现的方法
  def sayHi(): Unit ={
    println("xxx")
  }
}

abstract class Animal03{
  def sayHello()

  var food:String
}
class Cat extends Animal03 {
  override def sayHello(): Unit = {
    println("我们一起学猫叫")
  }

  override var food: String = "鱼罐头"
}

