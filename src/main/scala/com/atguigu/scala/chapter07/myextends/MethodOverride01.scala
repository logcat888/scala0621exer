package com.atguigu.scala.chapter07.myextends

/**
 * @author chenhuiup
 * @create 2020-09-17 18:37
 */
object MethodOverride01 {
  def main(args: Array[String]): Unit = {
    val emp = new Emp100
    emp.printName()
  }
}

// Person类
class Person100 {
  var name: String = "tom"

  def printName(): Unit = {
    println("Person printName()" + name)
  }

  def sayHi(): Unit = {
    println("哈哈哈")
  }
}

//这里我们继承Person
class Emp100 extends Person100 {
  //这里需要显式的使用override
  override def printName(): Unit = {
    println("Emp printName() " + name)
    //在子类中需要去调用父类的方法，使用super
    super.printName()
    sayHi()
  }

}
