package com.atguigu.scala.chapter05.fundetails

/**
 * 语法结构嵌套：
 * Scala语法中任何的语法结构都可以嵌套其他语法结构(灵活)，
 * 即：函数中可以再声明/定义函数，类中可以再声明类，方法中可以再声明/定义方法
 * @author chenhuiup
 * @create 2020-09-13 9:58
 */
object Details03 {
  def main(args: Array[String]): Unit = {

    //经过编译后f1 成为 Details03$ 的private final Unit Details03$f1
    def f1() :Unit = {
      println("f1")
    }
    sayOk()

    println("ok~~~")

    //通过$后的数字区分嵌套关系，三个sayOk()的地位都是一样，只不过修饰符不一样
    def sayOk():Unit = { //private final sayOk$1()
      println("main sayOk~~~")
      def sayOk():Unit = { //private final sayOk$2()
        println("sayOk sayOk~~~")
      }
    }

  }
  println("我最先执行")
  def sayOk():Unit = { //成员
    println("main sayOk")
  }

}
