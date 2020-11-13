package com.atguigu.scala.chapter06.oop

/**
 * 对象内存布局图
 * @author chenhuiup
 * @create 2020-09-13 15:59
 */
object MemState {
  def main(args: Array[String]): Unit = {
    val p1 = new Person3
    p1.name = "赵丽颖"
    p1.age = 18

    val p2 = p1
    println(p1 == p2) //true
    p2.name = "陈钰琪"
    println("p1.name = " + p1.name) //陈钰琪
  }

}

class Person3{
  var name = ""
  var age:Int = _ //如果是用_方式给默认值，则属性必须指定类型
}
