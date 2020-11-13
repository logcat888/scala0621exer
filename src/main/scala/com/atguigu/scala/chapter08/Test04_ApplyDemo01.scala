package com.atguigu.scala.chapter08

/**
 * @author chenhuiup
 * @create 2020-09-17 23:34
 */
object Test04_ApplyDemo01 {
  def main(args: Array[String]): Unit = {

    val pig = new Pig04("小花")

    //使用apply方法来创建对象
    val pig1 = Pig04("小花") //自动触发apply()
    val pig2 = Pig04()

  }

}

//apply方法的使用
class Pig04(var name:String)

object Pig04{
  //编写一个apply方法
  def apply(): Pig04 = new Pig04("小猪")
  def apply(name:String): Pig04 = new Pig04(name)
}
