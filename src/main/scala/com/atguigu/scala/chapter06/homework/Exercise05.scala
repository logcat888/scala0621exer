package com.atguigu.scala.chapter06.homework

import scala.collection.immutable.StringOps

/**
 * //字符串的本质是字符数组
 *
 * @author chenhuiup
 * @create 2020-09-13 17:06
 */
object Exercise05 {
  def main(args: Array[String]): Unit = {
    var res: Long = 1
    for (i <- "hello") { //字符串的本质是字符数组
      res *= i.toLong
    }
    println(res)

    println("----------------------------")
    //使用StringOps的foreach实现上述将字符串的每个元素取出，Unicode码值相乘
    res = 1
    val str: StringOps = "hello"
    //这里我们解释
    //1. res *= _.toLong 代表匿名函数, _代表函数的参数，不知道集合中的元素是什么类型
    str.foreach(res *= _.toLong)
    //    str.foreach((_) => res *= _.toLong)
    println(res)

    var res2 = 1L
    "hello".foreach(myCount)
    println(res2)

    def myCount(char: Char): Unit = {
      res2 *= char.toLong
    }

    println("--------------------------------")
    println(f1("hello"))
  }

  //使用递归的方式实现字符串中每个元素的乘积
  def f1(str: String): Long = {
    if (str == null || str.length == 0){
       0
    }
    if (str.length == 1) {
      str.charAt(0).toLong
    } else {
      str.charAt(0)*f1(str.substring(1))
    }
  }

}
