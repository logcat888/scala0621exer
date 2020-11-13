package com.atguigu.scala.chapter01

/**
 * @author chenhuiup
 * @create 2020-09-11 19:35
 */
object PrintDemo {
  def main(args: Array[String]): Unit = {
    //1.字符串连接
    var str1: String = "hello"
    var str2: String = "world"
    println(str1 + str2) //helloworld

    //2.
    var name:String ="tom"
    var age:Int = 10
    var sal:Float = 10.67f
    var height:Double = 180.15
    //格式化输出
    printf("名字=%s 年龄是%d 薪水是%.2f 身高%.3f",name,age,sal,height) //名字=tom 年龄是10 薪水是10.67 身高180.150

    //scala支持使用$输出内容，编译器会去解析$对应变量
    //s 代表提示解析 ； {} 表示内部支持表达式，支持运算
    // 如果字符串中出现了类似${age + 10} 则表示{}是一个表达式
    println(s"\n个人信息如下:\n 名字$name \n年龄$age \n薪水$sal")
    /*
    个人信息如下:
    名字tom
    年龄10
    薪水10.67
     */
    println(s"\n个人信息如下:\n 名字${name} \n年龄${age + 10} \n薪水${sal * 10}")
    /*
    个人信息如下:
    名字tom
    年龄20
    薪水106.7
     */
  }
}
