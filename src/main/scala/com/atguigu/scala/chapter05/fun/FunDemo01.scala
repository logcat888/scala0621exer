package com.atguigu.scala.chapter05.fun

/**
 * 大数据对数据的处理本质就是对集合的处理
 * @author chenhuiup
 * @create 2020-09-13 8:18
 */
object FunDemo01 {
  def main(args: Array[String]): Unit = {
    val n1 = 10
    val n2 = 20
    println("res=" + getRes(1, 2, ')'))
  }

  //定义函数/方法
  //返回值类型使用类型推导,只写 =
  def getRes(n1: Int, n2: Int, oper: Char) = {
    if (oper == '+') {
      n1 + n2
    } else if (oper == '-') {
      n1 - n2
    } else {
      null //返回null
    }
  }
}
