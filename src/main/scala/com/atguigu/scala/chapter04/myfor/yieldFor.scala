package com.atguigu.scala.chapter04.myfor

/**
 * @author chenhuiup
 * @create 2020-09-12 20:52
 */
object yieldFor {
  def main(args: Array[String]): Unit = {
    // val res = for (i <- 1 to 10) yield i
    //1.对Range结合 1 to 10 进行遍历
    //2.yield i 将每次循环得到i 放入到集合Vector中，并返回给res
    //3.i 这里是一个代码块，这就意味着我们可以对i进行处理
    //4.下面的这个方式，就体现出scala一个重要的语法特点，就是将一个集合中的各个数据进行处理，并返回给新的集合
    val res = for (i <- 1 to 10) yield {
      if (i % 2 == 0){
        i
      }else{
        "不是偶数"
      }
    }

    println(res)
    // Vector(不是偶数, 2, 不是偶数, 4, 不是偶数, 6, 不是偶数, 8, 不是偶数, 10)
  }

}
