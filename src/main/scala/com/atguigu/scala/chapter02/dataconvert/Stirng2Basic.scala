package com.atguigu.scala.chapter02.dataconvert

/**
 * @author chenhuiup
 * @create 2020-09-11 23:10
 */
object String2Basic {
  def main(args: Array[String]): Unit = {
    val d1 = 1.2
    val s1 = d1 + "" //以后看到有下划线，就表示编译器做了转换

    //String 类型转基本数据类型

    val s2 = "12"
    val num1 = s2.toInt
    val num2 = s2.toByte
    val num3 = s2.toDouble
    val num4 = s2.toLong

    //字符串转换为数值
    //思考就是要把“12.5”转成Int
    //在scala中，不是将小数点后的数据进行截取，而是会抛出异常
    val s4 = "12.5"
//    println(s4.toInt) //Java.lang.NumberFormatException: For input string: "12.5"
    println(s4.toDouble)  // 12.5
    val s5 = 12.5.toInt  //Double可以强转成Int
    println(s5) //12

  }

}
