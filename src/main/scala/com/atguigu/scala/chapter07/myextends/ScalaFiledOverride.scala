package com.atguigu.scala.chapter07.myextends

/**
 * @author chenhuiup
 * @create 2020-09-17 20:29
 */
object ScalaFiledOverride {
  def main(args: Array[String]): Unit = {
    val test1:AAA = new BBB
    val test2 = new BBB

    // test1.age => test1.age() // 动态绑定机制
    // test2.age => test2.age() // 20
    println(test1.age + "\t" + test2.age) // 20 20

  }

}

class AAA{
  val age:Int = 10 // 会生成public age()
}

class BBB extends AAA{
  override val age: Int = 20 // 会生成 public age()
}