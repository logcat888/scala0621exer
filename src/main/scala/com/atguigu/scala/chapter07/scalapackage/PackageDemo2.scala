package com.atguigu.scala.chapter07.scalapackage

import scala.beans.BeanProperty

/**
 * // 6. 包名可以相对也可以绝对，比如，访问BeanProperty的绝对路径是:_root_.scala.beans.BeanProperty,
 * //     在一般情况下：我们使用相对路径来引入包，只有当包名冲突时，使用绝对路径来处理。
 * 绝对路径导包的场景：自定义的包与系统的包重名时使用，_root_会从根路径计算，开发中使用的非常少。
 *
 *  为什么要有包对象： 包可以包含类、对象和特质trait，但是不能包含函数/方法或者变量的定义，这是java虚拟机的局限
 *  （他认为一个函数/方法/遍历应该归属于一个对象）。为了弥补这点不足，scala提供了包对象的概念来解决这个问题。
 *
 * @author chenhuiup
 * @create 2020-09-17 11:42
 */
object PackageDemo2 {
  def main(args: Array[String]): Unit = {
    val m = new Manger("jack")
    println("m = " + m)
  }
}

class Manger(var name: String) {
  // 第一种形式【使用相对路径引入包】
  @BeanProperty
  var age: Int = _
  // 第二种形式，和第一种一样，都是相对路径引入
  @scala.beans.BeanProperty var age2: Int = _

  // 第二种形式，是绝对路径引入，可以解决包名冲突
  @_root_.scala.beans.BeanProperty var age3: Int = _
}
