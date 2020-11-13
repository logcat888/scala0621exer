package com.atguigu.scala.chapter02.dataconvert

/**
 * @author chenhuiup
 * @create 2020-09-11 22:48
 */
object Demo01 {
  def main(args: Array[String]): Unit = {
    //1.有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量大的那种数据类型，然后再进行计算
    var n1 = 10
    var n2 = 1.1f
    var n3 = n1 + n2

    //2.(Byte,Short)和Char之间不会自动的转换类型
    var n4 :Byte = 10
//    var char1:Char = n4  //错误，因为Byte不能自动转换Char
    var b :Byte = 10
    var c :Char = 90
//    var s :Short = b + c// 报错，因为 b+c等于Int类型
    var s2:Short = 10 +90 //显示报错，但是没错，编译器和计算推断，只要不超过类型的范围即可
    var s3 : Short = 100

    var s4:Byte = 1 + 1 //ok
//    var s5:Byte = 1 + 127 // error

    println(s4)
  }
}
