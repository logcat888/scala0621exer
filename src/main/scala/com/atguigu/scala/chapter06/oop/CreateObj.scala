package com.atguigu.scala.chapter06.oop

/**
 *  scala中如何创建对象
 *  基本语法： val | var 对象名 [: 类型] = new 类型()
 *  说明：
 *  1）如果我们不希望改变对象的引用（即：内存地址），应该声明为val，否则声明为var，scala的设计者推荐使用val
 *  2）scala在声明对象变量时，可以根据创建对象的类型自动推断，所以类型声明可以省略，
 *     但当类型和后面new 对象类型有继承关系即多态时，就必须写
 *
 * @author chenhuiup
 * @create 2020-09-13 15:51
 */
object CreateObj {
  def main(args: Array[String]): Unit = {
    val emp = new Emp //emp 类型就是Emp
    //如果我们希望将子类对象，交给父类的引用，这时就需要写上类型
    val emp2:Person1 = new Emp
  }
}

class Person1{}

class Emp extends Person1{}
