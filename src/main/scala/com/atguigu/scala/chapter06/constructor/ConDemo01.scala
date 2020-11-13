package com.atguigu.scala.chapter06.constructor

/**
 * 构造器的快速入门：
 * 构造器分类：主构造器（一个） 和 辅助构造器（多个）
 *  基本语法：
 *   1）主构造器：  class 类名 （形参列表）{类体}
 *   2）辅助构造器：def this(形参列表){}
 *   注意：辅助构造器 函数的名称this，可以有多个，编译器通过不同参数来区分
 *
 * scala构造器注意事项和细节：
 * 1）Scala构造器作用是完成对新对象的初始化，构造器没有返回值
 * 2）主构造器的声明直接放置于类名之后
 * 3）主构造器会执行类定义中的所有语句，这里可以体会到scala的函数式编程和面向对象编程融合在一起，即：构造器也是方法（函数），
 *    传递参数和使用方法和前面的函数部分内容没有区别。
 *    注：主构造器其实就是把类体中除了函数的部分，全部都执行一遍，封装到一个构造器中，语法糖
 * 4）如果主构造器无参数，小括号可省略，构造对象时调用的构造方法的小括号也可以省略。
 * 5）辅助构造器名称为this（这个和java是不一样的），多个辅助构造器通过不同参数列表进行区分，在底层就是java的构造器重载。
 *    注：辅助构造器，必须在第一行显式调用主构造器(可以是直接，也可以是间接)。在scala中不允许子类的辅助构造器调用父类的构造器，即不允许子类辅助构造器使用super()
 *    //为什么辅助构造器需要在第一行调用主构造器？
 *    //答：实现调用主构造器时，能够实现调主构造器的父类，实现子类与父类之间的继承关系
 *  6）如果想让主构造器变成私有的，可以在()之前加上private，这样用户只能通过辅助构造器来构造对象了。
 *  7）辅助构造器的声明不能和主构造器的声明一致，会发生错误(即构造器名重复)
 *
 * @author chenhuiup
 * @create 2020-09-13 19:23
 */
object ConDemo01 {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("jack", 20)
    println(p1)
    println("--------------")
    //下面这句话就会调用辅助构造器 def this(name: String) {}
    val p2 = new Person("Tom")
    println(p2)

  }

}

//构造器的快速入门
//创建Person对象的同时初始化对象的age属性值和name属性值
//注：由于属性前不能加this.，所以主构造器的形参名不能写成与属性相同
class Person(inName: String, inAge: Int) {
  var name: String = inName
  var age: Int = inAge
  age += 10
  println("~~~~~~~~")

  //重写toString，便于输出对象的信息
  override def toString: String = {
    "name = " + name + ", age = " + age
  }

  println("ok~~~~~~~~~")
  println("age=" + age)

  //为什么辅助构造器需要在第一行调用主构造器？
  //答：实现调用主构造器时，能够实现调主构造器的父类
  def this(name: String) {
    //辅助构造器，必须在第一行显式调用主构造器（可以是直接，也可以是间接）
    this("jack", 10)
    this.name = name //重新赋值
  }
}
