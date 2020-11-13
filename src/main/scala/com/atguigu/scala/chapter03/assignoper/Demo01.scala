package com.atguigu.scala.chapter03.assignoper

/**
 * @author chenhuiup
 * @create 2020-09-12 7:24
 */
object Demo01 {
  def main(args: Array[String]): Unit = {
    var num = 2
    num <<= 2 //8
    num >>= 3 //1
    println("num:" + num)

    //在scala中支持代码块，返回值
    val res = {
      if (num > 1) "hello,ok" else 100
    }
    println("res=" + res)

    val res1 = -1 << 3
    println(res1)
  }
}
