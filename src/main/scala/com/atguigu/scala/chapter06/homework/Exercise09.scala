package com.atguigu.scala.chapter06.homework

/**
 * @author chenhuiup
 * @create 2020-09-13 17:51
 */
object Exercise09 {
  def main(args: Array[String]): Unit = {
    println(f1(2, -3))
  }
  def f1(x:Double,n:Int):Double = {
    if (n == 0){
      1
    }else if (n > 0){
      x * f1(x,n-1)
    }else{
      x / f1(x,-n)
    }

  }

}
