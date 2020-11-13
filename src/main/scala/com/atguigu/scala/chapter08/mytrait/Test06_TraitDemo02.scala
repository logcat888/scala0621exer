package com.atguigu.scala.chapter08.mytrait

/**
 * @author chenhuiup
 * @create 2020-09-18 7:35
 */
object Test06_TraitDemo02 {
  def main(args: Array[String]): Unit = {
    val c = new C
    val f = new F
    c.getConnection()
    f.getConnection()

  }
}

trait Trait01 {
  def getConnection()
}

//先将六个类的关系写出
class A {}

class B extends A {}

class C extends A with Trait01 {
  override def getConnection(): Unit = {
    println("连接mysql数据库...")
  }
}


class D {}

class E extends D {}

class F extends D with Trait01 {
  override def getConnection(): Unit = {
    println("连接oracle数据库...")
  }
}