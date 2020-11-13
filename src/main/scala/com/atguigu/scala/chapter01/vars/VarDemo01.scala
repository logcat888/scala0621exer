package com.atguigu.scala.chapter01.vars

/**
 * 通常情况下，基本数据类型放到栈，对象放到堆（java）
 * 有的编译器，动态的（逃逸分析），很灵活，不一定遵循上述规则
 *  1.生命周期很长，被多个变量引用：当一个数据的生命周期很长，而且需要被别的变量引用，
 *    多个变量引用同一个数据空间，往往把这种数据放到堆中，可以实现跨栈
 *  2.当一个数据空间只是临时用一下，往往把他放到栈里面，有可能他是一个对象
 *  3.放到堆的根本目的就是为了实现跨栈，在编译原理中，栈是每调用一个函数，就会产生一个新栈，其实每一个函数的变量是可以引用这个空间的，
 *    这时把数据放到栈中就很难引用，他就把数据放到堆中，那么不同的栈就可以引用同一个空间，他就是解决这个问题的
 *    如果他的数据量很大，但是引用一次就没有了，把他放到堆中就浪费空间了
 *  4.现代很多编译器做了逃逸分析，就不一定遵循基本数据类型放到栈，对象放到堆。
 * @author chenhuiup
 * @create 2020-09-11 19:35
 */
object VarDemo01 {

  def main(args: Array[String]): Unit = {
    var age:Int = 10
    var sal:Double = 10.9
    var name:String = "tom"
    var isPass:Boolean =true
    //在Scala中小数默认为Double，整数默认为Int
    var sorce:Float = 70.9f
    println(s"${age}${isPass}")
  }
}
