package com.atguigu.scala.chapter07.scalapackage

/**
 *  scala包的特点概述：
 *   基本语法： package 包名
 *
 *  scala包的四大作用
 *  1）区分相同名字的类
 *  2）当类很多时，可以很好的管理类
 *  3）控制访问的范围
 *  4）可以对类的功能进行扩展
 *
 *  scala中包名和源码所在的系统文件目录结构可以不一致，但是编译后的字节码文件路径和包名会保持一致（这个工作由编译器完成）
 *   注：1）说明scala的源文件在哪里写都行，只要指定了包（这个包可以不存在），编译器会帮把我们把字节码文件放到相应的包下。
 *       2） 当我们把包名更改后，编译器会把之前生成的字节码文件对应的文件路径删除，重新创建新的文件路径
 *      3） 编译放字节码文件的工作都是编译器帮我们做的。
 *
 * @author chenhuiup
 * @create 2020-09-13 23:08
 */
object TestTiger {
  def main(args: Array[String]): Unit = {
    //使用xh的Tiger
    val xhTiger = new com.atguigu.scala.chapter07.scalapackage.xh.Tiger
    //使用xm的Tiger
    val xmTiger = new com.atguigu.scala.chapter07.scalapackage.xm.Tiger

    println("xhTiger = " + xhTiger)
    println("xmTiger = " + xmTiger)

  }

}
