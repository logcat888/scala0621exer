package com.atguigu.scala.chapter04.mywhile

/**
 * @author chenhuiup
 * @create 2020-09-12 21:36
 */
object WhileDemo01 {
  def main(args: Array[String]): Unit = {
    //1.定义循环变量
    var i = 0
    //2. i<10条件
    while (i < 10) {
      println("hello,陈钰琪" + i) //循环体
      //循环变量迭代
      i += 1
    }
  }

}
