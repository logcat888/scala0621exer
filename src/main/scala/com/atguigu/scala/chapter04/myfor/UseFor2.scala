package com.atguigu.scala.chapter04.myfor

/**
 * for（） 用{} 代替()
 * @author chenhuiup
 * @create 2020-09-12 21:04
 */
object UseFor2 {
  def main(args: Array[String]): Unit = {
    //引入变量
    for (i <- 1 to 10; j = i * 2) {
      println("i = " + i + "j = " + j)
    }

    //等价
    println("----------------")
    for {
      i <- 1 to 10
      j = i * 2} {
      println("i = " + i + "j = " + j)
    }
  }

}
