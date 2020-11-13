package com.atguigu.scala.chapter04.mutilfor

import scala.io.StdIn

/**
 * @author chenhuiup
 * @create 2020-09-12 22:00
 */
object Exercise {
  def main(args: Array[String]): Unit = {
    var sum = 0
    var avg = 0
    for (i <- 1 to 3;j <- 1 to 3){
      println(s"请输入第$i 班的第$j 个同学的成绩")
      val score = StdIn.readInt()
      sum += score
      avg += score
      if (j == 3){
        sum /= 3
        println(s"第$i 班的平均成绩为$sum")
        sum = 0
        if (i == 3){
          avg /= i * j
          println(s"年级平均成绩为$avg")
        }
      }
    }
  }

}
