package com.atguigu.scala.chapter02.datatype

/**
 * @author chenhuiup
 * @create 2020-09-11 20:59
 */
object CharDemo {
  def main(args: Array[String]): Unit = {
    //当我们输出一个char类型是，他会输出该数字对应的字符(码值表 unicode) //Unicode 码值表包括ascii
    var c1 :Char = 97

    var char1 :Char = 'a' +1  //尽管idea报错，但是编译器会自己计算推断 'a' +1 的值是否在 Char的范围内，如果在范围内就没有问题
    println(char1) //b

//    var char2 :Char = 'a' +65535 //编译器计算出来，发现 'a' +65535 > 65535，无法给Char赋值，报错
//    println(char2)  //报错

    //原因和分析
    //1.当把一个计算的结果赋给一个变量，则编译器会进行类型转换及判断(即会看范围 + 类型)
    //2.当把一个字面量赋给一个变量，则编译器会进行范围的判定
    var c2 :Char = 97 + 1
    var c3 :Char = 97
    println(c2) // b
    println(c3) // a

  }
}
