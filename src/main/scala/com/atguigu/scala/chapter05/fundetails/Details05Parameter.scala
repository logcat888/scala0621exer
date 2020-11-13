package com.atguigu.scala.chapter05.fundetails

/**
 * //10.带名参数
 * @author chenhuiup
 * @create 2020-09-13 10:20
 */
object Details05Parameter {
  def main(args: Array[String]): Unit = {
    mysqlCon()
    mysqlCon("hadoop102",7777) //从左到右覆盖
    //如果我们希望指定覆盖某个默认值，则使用带名参数即可，比如修改用户名和密码,顺序可以颠倒
    mysqlCon(user = "atguigu",add = "hadoo103",pwd = "777777")

    //********************
//    f6("v2") //报错
    f6(p2 = "v2") //v1 + v2

  }

  def mysqlCon(add :String= "localhost",port :Int= 3306,user:String = "root",pwd:String = "123456")={
    println("add = " +add)
    println("port = " +port)
    println("user = " +user)
    println("pwd = " +pwd)
  }

  def f6(p1:String = "v1",p2:String): Unit ={
    println(p1 + " + "+ p2)
  }

}
