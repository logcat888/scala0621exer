package com.atguigu.scala.chapter07.myextends

/**
 * @author chenhuiup
 * @create 2020-09-17 19:23
 */
object ScalaBaseConstructot {
  def main(args: Array[String]): Unit = {
    //分析一下执行流程
    // 1.因为scala遵守先构建父类部分extends Person700（）
    // 2.Person...
    // 3.Emp...（Emp700的主构造器）
    // 4.Emp辅助构造器

    val emp = new Emp700()

    println("===================")
    val emp2 = new Emp700("赵丽颖")
  }

}

//父类Person
class Person700 {
  var name = "zhangsan"
  println("Person..." + name)
}

//子类Emp继承Person
class Emp700 extends Person700 {
  println("Emp ....")
  //辅助构造器
  def this(name: String) {
    this // 必须调用主构造器
    this.name = name
    println("Emp 辅助构造器~" + name)
  }
}

