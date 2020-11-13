package com.atguigu.scala.chapter04.myfor

/**
 * @author chenhuiup
 * @create 2020-09-12 20:42
 */
object ForVar {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3 ;j = 4 -i){
      println(j + "~~~~~~~")
    }
  }

}
