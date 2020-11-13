package com.atguigu.scala.chapter06.oop

/**
 * 养猫猫问题：使用普通的变量就不好管理
 * 面向对象的核心思想：
 * 类是一种新的数据类型：
 *  1）可以管理多个不同类型的数据【属性】 设置属性管理不同类型的数据
 *  2）可以对属性进行操作【方法】 用方法操作属性
 *
 *  scala类的定义：
 *  一个Scala源文件可以包含多个类，每个类默认都是public的
 *
 *  scala属性/成员变量：
 *  1）属性的定义语法同变量，示例：[访问修饰符] var 属性名称[:类型] = 属性值。  注意：访问修饰符默认为private 并提供相应的getter 和setter
 *  2）属性的定义类型可以为任意类型，包含值类型或者引用类型
 *  3）scala中声明一个属性，必须显示初始化，然后后根据初始化数据的类型自动推断，属性类型可以省略（和java不同）
 *  4）如果赋值为null，则一定要加类型，因为不加类型，那么该属性的类型就是Null类型。
 *
 * @author chenhuiup
 * @create 2020-09-13 14:51
 */
object CatDemo {
  def main(args: Array[String]): Unit = {
    //创建一只猫
    val cat = new Cat
    //给猫的属性赋值

    //说明
    //1. cat.name = "小白" 其实不是直接访问属性，而是  cat.name_$eq("小白")
    //2. cat.name 等价于 cat.name()
    cat.name = "小白"
    cat.age = 18
    cat.color = "白色"
    println("ok~~~")
    printf("\n小猫的信息如下: %s %d %s",cat.name,cat.age,cat.color)

  }
}

//定义一个类Cat
//一个class Cat 对应的字节码文件只有一个Cat.class ， 默认是public
class Cat{
  //定义/声明三个属性
  //说明
  //1. 当我们声明了 var name ：String 时，在底层（字节码文件）对应这 private name
  //2. 同时会生成 两个public 方法 name()  <=类似=> getter  public name_$eq() => setter
  var name:String = "" //给初始值，在scala中类的属性必须给初始值
  var age :Int = _  // _ 表示给age 一个默认值，如果是Int，默认就是0
  var color :String = _  //_ 给color 默认值，如果是String，默认是null
}

//对应java.class
/*
public class Cat
{
  private String name = "";
  private int age;
  private String color;

  public String name()
  {
    return this.name; }
  public void name_$eq(String x$1) { this.name = x$1; }
  public int age() { return this.age; }
  public void age_$eq(int x$1) { this.age = x$1; }
  public String color() { return this.color; }
  public void color_$eq(String x$1) { this.color = x$1; }

}
 */

class Dog{
  var name = "jack"
  var lover = new Fish
}
class Fish{}