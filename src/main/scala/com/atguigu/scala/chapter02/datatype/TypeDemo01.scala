package com.atguigu.scala.chapter02.datatype

/**
 * @author chenhuiup
 * @create 2020-09-11 19:47
 */
object TypeDemo01 {
  def main(args: Array[String]): Unit = {
    var num1:Int = 10
    //因为Int是一个类，因此它的一个实例，就可以使用很多方法
    //在scala中，如果一个方法，没有形参，则可以省略()
    println(num1.toDouble + "\t" + num1.toString +"\t" +100.toDouble)

    var isPass = true
    println(isPass.toString)
    sayHi
    sayHi()
  }

  def sayHi():Unit={
    println("haha")
  }

}
