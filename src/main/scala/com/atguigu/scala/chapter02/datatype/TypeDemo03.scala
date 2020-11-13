package com.atguigu.scala.chapter02.datatype

/**
 * @author chenhuiup
 * @create 2020-09-11 20:40
 */
object TypeDemo03 {
  def main(args: Array[String]): Unit = {
    println("Long的最大值" + Long.MaxValue + "Long的最大值" + Long.MinValue)
  //Long的最大值9223372036854775807Long的最大值-9223372036854775808
    //    var e = 98486518795328489265 // 说 98486518795328489265 超过Int

    var e: Float = 1.1F
    printf("%.9f", e) //1.100000024

    var num1 = 9.123456789f  //单精度浮点保留小数点后7位
    var num2 = 9.0123456789123456789  //双精度浮点的保留小数点后15位
    println("num1" + num1 + ":num2" + num2) //num19.123457:num29.012345678912345
  }
}
