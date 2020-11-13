package com.atguigu.scala.chapter05.recursive

/**
 * @author chenhuiup
 * @create 2020-09-13 8:56
 */
object Exercise01 {
  def main(args: Array[String]): Unit = {

    //测试斐波那契数列
    println("fbn的结果是=" + feibonacci(7))

    //测试猴子吃桃
    println("10天一共需要几个桃" + F2(10))
  }

  /**
   * 斐波那契数列
   * 使用递归时，函数的返回值就不能使用推导式了
   * @param n
   * @return
   */
  def feibonacci(n : Int): Int ={
    if (n == 1 || n == 2){
      1
    }else{
      feibonacci(n - 1) + feibonacci(n - 2)
    }
  }

  def fun1(n :Int):Int = {
    if (n == 1){
      3
    }else{
      2 * fun1(n - 1) + 1
    }
  }

  //猴子吃桃
  def F2(n : Int):Int = {
    if (n == 1){
      1
    }else{
      2 *(F2(n - 1) +1)
    }
  }



}
