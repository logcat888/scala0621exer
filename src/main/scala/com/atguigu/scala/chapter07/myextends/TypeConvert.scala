package com.atguigu.scala.chapter07.myextends

/**
 * @author chenhuiup
 * @create 2020-09-17 18:59
 */
object TypeConvert {
  def main(args: Array[String]): Unit = {
    //classOf[T] 的使用，可以得到类名
    println(classOf[String])//class java.lang.Class
    val s = "Tokyo"
    println(s.getClass.getName) // java.lang.String
    println(s.getClass.getClass) //class java.lang.Class
  }
}

// Person类
class Person200 {
  var name: String = "tom"

  def printName(): Unit = {
    println("Person printName()" + name)
  }

  def sayHi(): Unit = {
    println("哈哈哈")
  }
}

//这里我们继承Person
class Emp200 extends Person100 {
  //这里需要显式的使用override
  override def printName(): Unit = {
    println("Emp printName() " + name)
    //在子类中需要去调用父类的方法，使用super
    super.printName()
    sayHi()
  }

}
