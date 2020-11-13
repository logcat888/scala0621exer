package com.atguigu.scala.chapter08.mytrait

/**
 * @author chenhuiup
 * @create 2020-09-18 7:25
 */
object Test05_MyTrait {
  def main(args: Array[String]): Unit = {

  }

}

//trait Serializable extends Any with java.io.Serializable
//在scala中，java的接口都可以当做trait来使用
object T1 extends Serializable{}