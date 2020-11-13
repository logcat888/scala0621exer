package com.atguigu.scala.chapter05.fundetails

/**
 * 返回值类型有无  与 return 有无之间的关系
 * @author chenhuiup
 * @create 2020-09-13 9:41
 */
object Details02 {
  def main(args: Array[String]): Unit = {

    println(getSum2(10,20)) //()
    println(getSum3(10,20)) //()
  }

  //如果写了return，返回值类型就不能省略
  //报错
//  def getSum(n1:Int,n2:Int)={
//    return n1 + n2
//  }
    def getSum(n1:Int,n2:Int):Int={
      return n1 + n2
    }

  //如果返回值这里什么都没有写，即表示该函数没有返回值
  //这时return无效
  def getSum2(n1:Int,n2:Int){
    return n1 + n2
  }

  //如果函数声明无返回值(声明Unit)，那么函数体中即使使用return关键字也不会有返回值
  def getSum3(n1:Int,n2:Int):Unit = {
    return n1 + n2
  }


}
