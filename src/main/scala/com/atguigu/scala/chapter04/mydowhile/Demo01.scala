package com.atguigu.scala.chapter04.mydowhile

/**
 * @author chenhuiup
 * @create 2020-09-12 21:51
 */
object Demo01 {
  def main(args: Array[String]): Unit = {
    var i = 0 //推荐for循环
    do{
      println(i + "我是小明")
      i += 1
    }while(i < 10)
  }

}
