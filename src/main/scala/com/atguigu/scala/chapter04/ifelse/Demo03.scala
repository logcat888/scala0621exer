package com.atguigu.scala.chapter04.ifelse

/**
 * @author chenhuiup
 * @create 2020-09-12 19:26
 */
object Demo03 {
  def main(args:Array[String]):Unit={
  //如果大括号内的逻辑代码只有一行，大括号可以省略，这点和java的规定一样
    if (5 >4) println("5 > 4")

    //Scala中任意表达式都是有返回值的，也就意味着if else表达式其实是由返回结果，具体返回结果的值取决于
    // 满足条件的代码体的最后一行内容
    val age = 70
    val res = if (age > 20){
      println("hello age > 20")
      9 + 10
      "yes ok"
    }else{
      7
    }

    println("res=" + res) // yes ok //res 的类型是Any
  }

}
