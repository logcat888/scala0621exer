package com.atguigu.scala.chapter05.fundetails

/**
 * 13.scala函数支持可变参数，比如支持0到多个参数 def sum(agrs:Int*):Int={}  支持1到多个参数 def sum(n1:Int,agrs:Int*):Int={}
 *    args是集合Seq，通过for循环可以访问到各个值
 *    注意：可变形参只能放到形参列表的最后
 *
 * @author chenhuiup
 * @create 2020-09-13 10:51
 */
object Details07varParameters {
  def main(args: Array[String]): Unit = {
    //编写一个函数sum，可以求出 1 到 多个int的和
    println(sum(10,30,10,3,45,7))
  }

  def sum(n1:Int,args:Int*):Int={
    println("args.length = "+ args.length) //5
    println("args.length = "+ args.size) //5
    var sum = n1
    for (item <- args){
      sum += item
    }
    sum
  }

  //报错，可变参数需要放到最后
//  def sum2(args:Int*,n1:Int):Int={
//    1
//  }
}
