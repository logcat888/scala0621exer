package com.atguigu.scala.chapter03.arithoper

/**
 * @author chenhuiup
 * @create 2020-09-11 23:46
 */
object Demo01 {
  def main(args: Array[String]): Unit = {

    // % 的使用
    //1. % 的运算的原则： a % b = a - a/b * b
    println(10 % 3) //1
    println(-10 % 3) //-1
    println(10 % -3) // 1
    println(-10 % -3) // -1

    // / 的使用
    println(10 / 3) //3
    println(-10 / 3) //-3
    println(10 / -3) // -3
    println(-10 / -3) // 3

    var r2:Double = 10 /3
    println(r2) //3.0

    var r3 :Double = 10.0 /3
    println(r3) //3.333333
    println(r3.formatted("%.2f"))//3.33

    // ++ 和 --
    //说明在scala中没有 ++ 和 -- ，而使用 +=1 和 -= 1

    val s1 = "abc"

    val s2 = new String("abc")

    println(s1 == s2) //true
    println(s1.eq(s2)) // false
    println(s1.equals(s2)) // true

  }
}
