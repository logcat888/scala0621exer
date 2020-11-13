package com.atguigu.scala.chapter07.myextends

/**
 * @author chenhuiup
 * @create 2020-09-17 21:12
 */
object FiledOverrideDetails03 {
  def main(args: Array[String]): Unit = {

  }

}

/*
在A03中，有一个抽象的字段(属性)
1. 抽象的字段（属性）：就是没有初始化的字段（属性）
2. 当一个类含有抽象属性时，则该类需要标记为abstract
3. 对于抽象的属性，在底层不会生成对应的属性声明，而是生成两个对应的抽象方法（name() 和 name_$eq()）
 */

abstract class A03{
  var name:String //抽象
  var age:Int = 10
}

class Sub_03 extends A03{
  //说明
  // 1.如果我们在子类中去重写父类的抽象属性，本质是实现了抽象方法
  // 2.因此这里我们可以写override，也可以不写
//  override var name: String = "_" //ok
  var name: String = "_"

  //非抽象的var类型属性只能直接赋值
//  var age:Int = 10  // error
//  override var age:Int = 10 //error
//  age:Int = 10 //error
  age = 10
}