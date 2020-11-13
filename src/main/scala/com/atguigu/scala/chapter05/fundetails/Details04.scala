package com.atguigu.scala.chapter05.fundetails

/**
 *  9.函数参数默认值
 * @author chenhuiup
 * @create 2020-09-13 10:12
 */
object Details04 {
  def main(args: Array[String]): Unit = {
    println(sayOk()) //jack-ok!
    println(sayOk("赵丽颖")) //赵丽颖-ok!

  }

  //name形参的默认值jack
  def sayOk(name:String = "jack") :String ={
    return name + "-ok!"
  }
}
