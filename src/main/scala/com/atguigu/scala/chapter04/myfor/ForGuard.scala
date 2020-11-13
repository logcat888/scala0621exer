package com.atguigu.scala.chapter04.myfor

/**
 * @author chenhuiup
 * @create 2020-09-12 20:38
 */
object ForGuard {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 3 if i != 2)
      println(s"$i ~~~~~~~")
  }

}
