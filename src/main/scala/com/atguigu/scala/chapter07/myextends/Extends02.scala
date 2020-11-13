package com.atguigu.scala.chapter07.myextends

/**
 * @author chenhuiup
 * @create 2020-09-17 16:45
 */
/*
1. 在scala中，子类继承了父类的所有属性和方法，但是private的属性和方法无法访问。
 */
object Extends02 {
  def main(args: Array[String]): Unit = {
    val sub = new Sub()
    sub.sayOk()
    sub.test100()
//    sub.test200() //error 无法访问protected

    val base = new Base
//    sub.test200() //error 无法访问protected
  }
}

//父类
class Base {
  var n1: Int = 1  // public n1(),public n1_$eq()
  protected var n2: Int = 2
  private var n3: Int = 3 //private n3(),private n3_$eq()

  def test100(): Unit = { // 默认是public
    println("base 100")
  }

  protected def test200(): Unit = {
    println("base 200")
  }

  private def test300(): Unit = {
    println("base 300")
  }
}

class Sub extends Base {
  def sayOk(): Unit = {
    this.n1 = 20 // 访问的本质还是 this.n1_$eq()
    this.n2 = 40
    println("范围" + this.n1 + this.n2)

    test100()
    test200() //在子类中使用protected
  }
}

