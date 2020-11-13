package com.atguigu.scala.chapter04.myfor

/**
 * For循环步长
 *
 * @author chenhuiup
 * @create 2020-09-12 21:10
 */
object StepFor {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      //      i += 1  //报错， i 是 val 类型，不可改变
      println("i = " + i)
    }

    //步长控制为2
    println("------------------------")
    //Range(1,10,2)的对应的构造方法是
    //def apply(start: Int, end: Int, step: Int): Range = new Range(start, end, step)
    //默认步长为1，def apply(start: Int, end: Int): Range = new Range(start, end, 1)
    for (i <- Range(1, 10, 2)) {
      println("i = " + i)
    }

    println("------------------------")
    //控制步长的第二种方式-for循环守卫
    for (i <- 1 to 10 if i % 2 != 0) {
      println("i = " + i)
    }

    println("------------------------")
    //控制步长的第三种方式- by方法
    for (i <- 1 to 10 by 2) {
      println("i = " + i)
    }

    //等价于
    for (i <- 1.to(10,2)) {
      println("i = " + i)
    }

    //等价于
    //拷贝Range结合
    //def by(step: Int): Range = copy(start, end, step)
    for (i <- 1.to(10).by(2)) {
      println("i = " + i)
    }
  }

}
