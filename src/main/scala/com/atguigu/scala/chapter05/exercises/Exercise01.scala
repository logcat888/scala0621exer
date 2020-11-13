package com.atguigu.scala.chapter05.exercises

/**
 *
 * 养猫猫问题：使用普通的变量就不好管理
 * 面向对象的核心思想：
 * 类是一种新的数据类型：
 *  1）可以管理多个不同类型的数据【属性】 设置属性管理不同类型的数据
 *  2）可以对属性进行操作【方法】 用方法操作属性
 *
 * @author chenhuiup
 * @create 2020-09-13 14:23
 */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    f1(5)
    println("---------------------------------")
    f2(10)
  }

  //编写一个函数，输出99乘法表
  def f1(n: Int) {
    for (i <- 1 to n; j <- 1 to i) {
      print(s"$j * $i = ${i * j}\t")
      if (i == j) {
        println()
      }
    }
  }

  //编写一个函数，输出金字塔

  def f2(n: Int) {
    for (i <- 1 to n) {
      println(" " * (n - i) + "*" * (2 * i - 1))
    }
  }
}
