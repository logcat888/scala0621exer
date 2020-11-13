package com.atguigu.scala.chapter04.myfor

/**
 * @author chenhuiup
 * @create 2020-09-12 20:21
 */
object ForDemo01 {
  def main(args: Array[String]): Unit = {
    //输出10句“你好，陈钰琪”
    val start = 1
    val end = 10
    //说明
    //1.start 从哪个数开始循环
    //2.to 是关键字
    //3.end 循环结束的值
    //4.start to end 表示前后闭合
    // to 其实是RichInt中的方法def to(end: Int): Range.Inclusive = Range.inclusive(self, end) 返回一个Range
    // <- 是遍历的方法 final override def foreach[@specialized(Unit) U](f: Int => U)
    for (i <- start to end) {
      println("你好，陈钰琪" + i)
    }

    //说明for 这种推导式，也可以直接对集合进行遍历
    var list = List("hello", 10, 30, "tom")
    for (item <- list) {
      println("item=" + item)
    }
  }
}
