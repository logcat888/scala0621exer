package com.atguigu.scala.chapter04.myfor

/**
 * @author chenhuiup
 * @create 2020-09-12 21:23
 */
object ForExercise01 {
  def main(args: Array[String]): Unit = {
    //打印1-100之间所有是9的倍数的整数的个数及总和，完成下面的表达式输出
    var count = 0;
    var sum = 0;
    for (i <- 1 to 100 if i % 9 == 0) {
      count += 1
      sum += i
    }
    println(s"个数为$count ,总和为$sum")

    //输出加法的循环表达式
    for (i <- 0 to 6)
      println(s"$i + ${6 - i } = 6")
  }

}
