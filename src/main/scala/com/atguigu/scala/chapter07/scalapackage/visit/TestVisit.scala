package com.atguigu.scala.chapter07.scalapackage.visit

/**
 * @author chenhuiup
 * @create 2020-09-17 14:14
 */
object TestVisit {
  def main(args: Array[String]): Unit = {
val c = new Clerk()

    c.showInfo()
    Clerk.test(c) //伴生对象使用了私有的属性

    //创建一个Person对象
    val p1 = new Person()
    println(p1.name)

  }
}
/*
scala中包的可见性和访问修饰符的使用

1）当属性访问权限为默认时，从底层看属性是private的，但是因为提供了xxx_$eq()[类似setter]/xxx()[类似getter] 方法，因此从使用效果看是任何地方都可以访问)
2）当方法访问权限为默认时，默认为public访问权限
3）private为私有权限，只在类的内部和伴生对象中可用 【案例演示】
4）protected为受保护权限，scala中受保护权限比Java中更严格，只能子类访问，同包无法访问 (编译器)
5）在scala中没有public关键字,即不能用public显式的修饰属性和方法。【案演】

 */

class Clerk{
  var name:String = "jack" //在scala中默认是public的，但是底层是private的，可读可写
  private var sal:Double = 9999.9 // 只生成可读的方法，不能修改

  def showInfo()={
    //在奔雷可以使用私有的
    println("name " + name + " sal = " + sal)
  }
}
/*
当一个文件中出现了 class Clerk 和 object Clerk
1. class Clerk 称为 伴生类
2. object Clerk 称为 伴生对象
3. 因为scala设计者将static拿掉（他认为static不属于面向对象的范畴，但是为了jvm无缝接轨），他就设计了伴生类和伴生对象
4. 伴生类写 非静态的内容，伴生对象写静态的内容
*/
object Clerk{
  def test(c:Clerk):Unit ={
    //这里体现出在伴生对象中，可以方法c.sal
    println("test() " + c.name + " sal = " + c.sal)
  }
}

class Person{
  //这里我们增加一个包访问权限
  // 下面private [visit]
  // 1. 仍然是private
  // 2. 在visit包下（包括子包）也可以使用name，相当于扩大了访问范围
  private[visit]val name = "jack"
}