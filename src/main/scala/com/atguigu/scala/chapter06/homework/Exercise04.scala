package com.atguigu.scala.chapter06.homework

/**
 * @author chenhuiup
 * @create 2020-09-13 16:43
 */
object Exercise04 {
  def main(args: Array[String]): Unit = {
    val n = 3
    val res = (0 to n).reverse //返回了 Range(3,2,1,0)
    //韩老师输出的是Range(3,2,1,0)
    println(res) //Range 3 to 0 by -1

    println(res.foreach(print)) //3210()

    //foreach
    //foreach 函数 def foreach[@specialized(Unit) U](f: Int => U) ,即接收一个输入参数为Int，输出为U的函数
    //说明
    //1.将res的每个元素依次遍历出来，传递给println(x)
    res.foreach(println) //3210

    //2.将res的每个元素依次遍历出来，传递给myshow(x)
    res.foreach(myshow) //3210

    //一步搞定
    println("--------------------------")
    (0 to 3).reverse.foreach(print) //3210

  }

  def myshow(n:Int):Unit={
    println(n)
  }

}
