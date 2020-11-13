package com.atguigu.scala.chapter01

/**
 * 只要以后看到有object TestScala，你应该有这样一个认识
 * 1.object TestScala对应的是一个TestScala$的一个静态对象MODULE$
 * 2.在我们的程序中，是一个单例
 *
 * 面试题：def main 是不是真正的入口函数？
 * 其实他不是真正的，还是被包装了一下，可以等价于程序入口，但是还是被包裹了一下
 *
 * Scala 程序开发注意事项
 * 1）Scala源文件以“.Scala”为扩展名
 * 2）Scala程序的执行入口是main()函数
 * 3）Scala语言严格区分大小写
 * 4）Scala方法由一条条语句构成，每个语句后不需要分号(Scala语言会在每行后自动加分号)，这体现出Scala语言的间接性
 * 5）如果再同一行有多条语句，除了最后一条不需要分号，其他都需要分号
 * @author chenhuiup
 * @create 2020-09-11 19:34
 */
object Hello {
  def main(args: Array[String]): Unit = {
    println("hello,scala")
    var num1: Int =10
    var num2: Int = 20
    println(num1 + num2)
  }
}

