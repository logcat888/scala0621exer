package com.atguigu.scala.chapter02.iden

/**
 * @author chenhuiup
 * @create 2020-09-11 23:26
 */
object IdenDemo01 {
  def main(args: Array[String]): Unit = {
    //首字符为操作符（比如 + - * /），后续字符也需跟操作符，至少一个
    val ++ = "hello"
    println(++) //hello

    val +*/- = 90 //ok
    println("res=" + +*/-) //res=90

    //看看编译器 是怎么处理这个问题的
    // ++ =>  编译器处理成  $plus$plus
    //val +q = "abc" //error

    val Int = 90.45
    println("Int=" + Int) //Int=90.45

    //不能使用_ 做标识符 ，scala中_有很多特殊含义
    var _ = "jack"  //这句话不报错
//        println(_)   //如果执行这句话会报错 missing parameter type for expanded function

    //下面是可以执行的
//    var `_` = "jack"
//    println(`_`) //jack
  }

}
