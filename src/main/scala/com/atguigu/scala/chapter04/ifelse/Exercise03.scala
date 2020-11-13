package com.atguigu.scala.chapter04.ifelse

/**
 * @author chenhuiup
 * @create 2020-09-12 19:34
 */
object Exercise03 {
  def main(args: Array[String]): Unit = {
    val sumVal = 20
    val result = if (sumVal > 20) "结果大于20"
    println("res=" + result) // 返回的是() 即Unit   result的类型为Any
  }
}
