package com.atguigu.scala.chapter06.constructor

/**
 * @author chenhuiup
 * @create 2020-09-13 20:18
 */
object ConDemo03 {
  def main(args: Array[String]): Unit = {
    val person = new Person1(18)
  }
}

//定义了一个Person类
class Person1 private() {
  var name: String = _
  var age: Int = _

  private def this(name: String) {
    //辅助构造器无论是直接或间接，最终都一定要调用主构造器，执行主构造器的逻辑
    //而且需要放在辅助构造器的第一行（这点与java一样，java中一个构造器要调用同类的其他构造器，也需要放在第一行）
    this() //直接调用主构造器
    this.name = name
  }

  def this(name: String, age: Int) {
    this() //直接调用主构造器
    this.name = name
    this.age = age
  }

  def this(age: Int) {
    this("匿名") //间接调用主构造器，因为def this(name :String )中调用了主构造器!
    this.age = age
  }
}
