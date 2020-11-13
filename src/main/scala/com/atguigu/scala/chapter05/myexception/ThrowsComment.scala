package com.atguigu.scala.chapter05.myexception

/**
 * @author chenhuiup
 * @create 2020-09-13 14:16
 */
object ThrowsComment {
  def main(args: Array[String]): Unit = {
    try {
      f1()
    } catch {
      case ex:NumberFormatException => println("哈哈哈")
    } finally {}
  }

  @throws(classOf[NumberFormatException]) //等同于Java NumberFormatException.class
  def f1() = {
    "abc".toInt
  }

}
