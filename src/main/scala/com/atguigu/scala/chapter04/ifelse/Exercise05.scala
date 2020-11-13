package com.atguigu.scala.chapter04.ifelse

import java.time.{LocalDate, Month}
import java.util.Date

import scala.io.StdIn

/**
 * @author chenhuiup
 * @create 2020-09-12 19:45
 */
object Exercise05 {
  def main(args: Array[String]): Unit = {
    println("请输入您的年龄")
    val age = StdIn.readInt()
    val date = LocalDate.now()
    println(date)
    val month = date.getMonthValue
    val price = if (month >= 4 && month <= 10) {
      if (age > 60)
        20
      else if (age < 18)
        30
      else 60
    } else {
      if (age > 18 && age < 60) 40 else 20
    }

    println(s"$month 月$age 岁的票价为：$price")
  }

}
