package com.atguigu.scala.chapter06.method

/**
 * @author chenhuiup
 * @create 2020-09-13 18:48
 */
object MethodDemo01 {
  def main(args: Array[String]): Unit = {

  }

}

//注：使用_ 为属性初始化，属性的类型不能省略，不然_不知道该匹配什么类型的初始化值
class Dog{
  private var sal :Double = _
  var food :String = _

  def cal(n1:Int,n2:Int):Int={
    n1+ n2
  }
}

