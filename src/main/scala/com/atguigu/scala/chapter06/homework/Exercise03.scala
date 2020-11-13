package com.atguigu.scala.chapter06.homework

/**
 * @author chenhuiup
 * @create 2020-09-13 16:32
 */
object Exercise03 {
  def main(args: Array[String]): Unit = {
    //定义List集合
    val list = List(1,2,3)

    println(list reverse) //List(3, 2, 1)

    //韩老师打印出来是Range(10,9,8,7,6,5,4,3,2,1)
    println((1 to 10 ).reverse) //Range 10 to 1 by -1
    println(1.to(10).reverse) //Range 10 to 1 by -1
    println(1.to(10).reverse.toString()) //Range 10 to 1 by -1

    /*
      override def toString = {
    val preposition = if (isInclusive) "to" else "until"
    val stepped = if (step == 1) "" else s" by $step"
    val prefix = if (isEmpty) "empty " else if (!isExact) "inexact " else ""
    s"${prefix}Range $start $preposition $end$stepped"
  }
     */

  }

}
