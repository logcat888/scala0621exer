package com.atguigu.scala.chapter04.myfor

/**
 * @author chenhuiup
 * @create 2020-09-12 20:33
 */
object ForUntilDemo02 {
  def main(args: Array[String]): Unit = {
    //输出10句“你好，陈钰琪”
    val start = 1
    val end = 10
    //说明
    //1.start 从哪个数开始循环
    //2.to 是关键字
    //3.end 循环结束的值 - 1
    //4.start to end 表示前后闭合
    // to 其实是RichInt中的方法def until(end: Int): Range = Range(self, end) 返回一个Range
    // <- 是遍历的方法 final override def foreach[@specialized(Unit) U](f: Int => U)
    for (i <- start until end) {
      println("你好，陈钰琪" + i)
    }
  }
}
