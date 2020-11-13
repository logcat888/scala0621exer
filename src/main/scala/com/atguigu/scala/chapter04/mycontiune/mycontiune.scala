package com.atguigu.scala.chapter04.mycontiune

/**
 * @author chenhuiup
 * @create 2020-09-12 22:46
 */
object mycontiune {
  def main(args: Array[String]): Unit = {
    //说明
    //1. 循环守卫 if (i != 2 && i != 3) 这个条件为true，才执行循环体
    for (i <- 1 to 10 if (i != 2 && i != 3)){
      println("i = " + i)
    }

    //也可以写成如下的形式
    println("===================")
    for (i <- 1 to 10 ){
      if (i != 2 && i != 3){
        println("i = " + i)
      }
    }
  }

}
