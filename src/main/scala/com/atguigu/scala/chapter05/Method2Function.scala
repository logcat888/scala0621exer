package com.atguigu.scala.chapter05

import com.atguigu.scala.chapter02.datatype.Dog

/**
 * @author chenhuiup
 * @create 2020-09-12 23:13
 */
object Method2Function {
  def main(args: Array[String]): Unit = {
    //使用方法
    //先创建一个对象
    val dog = new Dog
    println(dog.sum(10, 20))

    //方法转成函数
    val f1 = dog.sum _
    //韩老师打印出来是f1 = <function>
    println("f1 = " + f1) //f1 = com.atguigu.scala.chapter05.Method2Function$$$Lambda$5/1975358023@7d417077
    println("f1 = " + f1(50, 60)) //110

    //函数，求两个数的和
    val f2 = (n1:Int,n2:Int) => {
      n1 + n2 //函数体
    }
    //韩老师打印出来是f2 = <function2> 2 代表两个参数
    println("f2 = " + f2) //f2 = com.atguigu.scala.chapter05.Method2Function$$$Lambda$6/901506536@2c8d66b2

    println((1 to 10) )

    println( new Range(1,10,1))
  }
}
class Dog {
  //方法
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}
