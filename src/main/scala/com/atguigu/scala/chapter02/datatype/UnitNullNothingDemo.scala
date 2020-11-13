package com.atguigu.scala.chapter02.datatype

/**
 * @author chenhuiup
 * @create 2020-09-11 21:18
 */
object UnitNullNothingDemo {
  def main(args: Array[String]): Unit = {
    val res = sayHello
    println("res=" + res) //res=()

    //Null类只有一个实例对象，null，类似于Java中的null引用。null可以赋值给任意引用类型（AnyRef），但是
    // 不能赋值给值类型(AnyVal: 比如Int，Float，Char，Boolean，Long，Double，Byte，Short)
    val dog: Dog = null
//    val char1: Char = null //报错,不能隐式转换
  }

  //Unit等价于java的void，只有一个实例()
  def sayHello(): Unit = {
  }

  println("aaa")
}

class Dog {

}