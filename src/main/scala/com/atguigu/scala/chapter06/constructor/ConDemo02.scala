package com.atguigu.scala.chapter06.constructor

/**
 * 父类构造器，主构造器，辅助构造器之间的执行顺序：由父及子
 * @author chenhuiup
 * @create 2020-09-13 20:07
 */
object ConDemo02 {
  def main(args: Array[String]): Unit = {
    val a = new A  //调用A的主构造器
    println("~~~~~~~~~")
    val b = new A("赵丽颖")  //调用A的辅助构造器
  }
}

class B{
  println("父类B的主构造器~~~~~")
}


class A() extends B {
  println("A的主构造器~~~~~~~")
  def this(name:String){
    this //调用A的主构造器
    println("A的辅助构造器~~~~~")
  }
}