package com.atguigu.scala.chapter05.fundetails

/**
 * @author chenhuiup
 * @create 2020-09-13 10:42
 */
object Details06Recursive {
  def main(args: Array[String]): Unit = {

  }

  //报错，递归不能自动推断出返回值类型，必须明确指出
//  def f1(n:Int) = {
//    if (n == 1)
//      1
//    else
//      f1(n-1)
//  }
    def f1(n:Int):Int = {
    if (n == 1)
      1
    else
      f1(n-1)
  }

}
