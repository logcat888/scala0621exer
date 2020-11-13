package com.atguigu.scala.chapter08

/**
 * 有一群小孩在玩堆雪人,不时有新的小孩加入,请问如何知道现在共有多少人在玩?
 * 请使用面向对象的思想，编写程序解决
 *
 * @author chenhuiup
 * @create 2020-09-17 23:21
 */
object Test03_ChildJoinGame {
  def main(args: Array[String]): Unit = {
    val child01 = new Child03
    val child02 = new Child03
    val child03 = new Child03
    val child04 = new Child03

    println(Child03.getChildCount())
  }

}

class Child03{
  var name = ""
  Child03.childCount += 1
}

object Child03{
  //统计共有多少个小孩的属性
  private var childCount:Int = 0

  def getChildCount():Int={
    childCount
  }
}
