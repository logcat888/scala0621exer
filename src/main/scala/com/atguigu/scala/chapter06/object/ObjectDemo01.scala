package com.atguigu.scala.chapter06.`object`

/**
 * scala对象创建的流程分析
 * 1）加载类信息（属性信息，方法信息），到方法区
 * 2）在内存中（堆）开辟空间，空间开辟的大小根据属性的大小判断。 比如age用Int是不对的，用成Short能够节省空间，比如1000万个对象
 * 3) 使用父类的构造器（主和辅助）进行初始化
 * 4）使用主构造器对属性进行初始化 【age:90  name null】
 * 5）使用辅助构造器对属性进行初始化 【age:20  name 小青】
 * 6）将开辟的对象的地址赋给p这个引用
 *
 * @author chenhuiup
 * @create 2020-09-13 21:27
 */
object ObjectDemo01 {
  def main(args: Array[String]): Unit = {
    var p = new Person("小青", 20)
  }
}

class Person {
  var age: Short = 90
  var name: String = _

  def this(n: String, a: Int) {
    this()
    this.name = n
    this.age = 18
  }
}