package com.atguigu.scala.chapter02.datatype

/**
 * @author chenhuiup
 * @create 2020-09-11 20:07
 */
object TypeDemo02 {
  def main(args: Array[String]): Unit = {
    println(sayhello)

    var num = 1.2 //默认为Double
    var num2 = 1.7f //这是float
    num2 = num.toFloat
  }

  //比如开发中，我们有一个方法，就会异常中断，这是就可以返回Nothing
  //即当我们Nothing做返回值，就是明确说明该方法没有正常返回值
  def sayhello:Nothing ={
    throw new Exception("抛出异常")
  }
}
