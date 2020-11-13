package com.atguigu.scala.chapter06.oop

/**
 *  scala属性/成员变量（基础部分）：
 *  1）属性的定义语法同变量，示例：[访问修饰符] var 属性名称[:类型] = 属性值。  注意：访问修饰符默认为private 并提供相应的getter 和setter
 *  2）属性的定义类型可以为任意类型，包含值类型或者引用类型
 *  3）scala中声明一个属性，必须显示初始化，然后后根据初始化数据的类型自动推断，属性类型可以省略（和java不同）
 *  4）如果赋值为null，则一定要加类型，因为不加类型，那么该属性的类型就是Null类型。
 *  5)如果在定义属性时，暂时不赋值，也可以使用符号_(下划线),让系统分配默认值
 *  6）不同对象的属性是独立，互不影响，一个对象对属性的更改，不影响另外一个。
 *
 *  scala中如何创建对象
 *  基本语法： val | var 对象名 [: 类型] = new 类型()
 *  说明：
 *  1）如果我们不希望改变对象的引用（即：内存地址），应该声明为val，否则声明为var，scala的设计者推荐使用val
 *  2）scala在声明对象变量时，可以根据创建对象的类型自动推断，所以类型声明可以省略，
 *     但当类型和后面new 对象类型有继承关系即多态时，就必须写
 *
 * @author chenhuiup
 * @create 2020-09-13 15:27
 */
object PropertyDemo {
  def main(args: Array[String]): Unit = {
    val p1 = new Person
    println(p1.name) //null,Null类型
//    println(p1.name.toString)  //NullPointerException
    println(p1.address) //null,String类型
//    println(p1.address.toString) //NullPointerException

    println("-------------------")
    val p2 = new A
    println(p2.var1) // null
    println(p2.var2) // 0
    println(p2.var3) // 不可见的0（ASCII第一位）
    println(p2.var4) // 0.0
    println(p2.var5) //false

  }

}

class Person{
  var age:Int = 10 //给属性赋初值，省略类型，会自动推导
  var sal = 8099.9
  var name = null //name 是Null类型
  var address :String = null
}

class A{
  var var1:String = _
  var var2:Byte = _
  var var3:Char = _
  var var4:Double = _
  var var5:Boolean = _
}
