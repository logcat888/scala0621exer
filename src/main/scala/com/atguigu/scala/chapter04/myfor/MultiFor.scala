package com.atguigu.scala.chapter04.myfor

/**
 * 关于scala的设计者不推荐使用while，而是推荐使用for
 * 因为while中没有返回值，所以当要用该语句来计算并返回结果时，就不可避免的使用变量，而变量
 * 需要声明在while循环的外部，那么就等同于循环的内部对外部的变量造成了影响
 * scala的设计者提倡【纯函数】的概念
 * scala的设计理念无论是for，while，dowhile、函数等都尽量不使用外部变量，他是通过函数递归实现，在栈中，在函数的内部变量
 * @author chenhuiup
 * @create 2020-09-12 20:45
 */
object MultiFor {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j <- 1 to 3){
      println(s"i = $i , j = $j")
    }

    //上面的写法，可以写成
    //i <- 1 to 3 等价于i <- 1.to(3) 可以使用空格代替逗点，投代表的是1这个对象的方法
    println("===========================")
    for (i <- 1 to 3)
      for (j <- 1.to(3))
        println(s"i = $i , j = $j")
  }

}
