package com.atguigu.scala.chapter05.recursive

/**
 * 函数递归需要遵守的重要原则(总结)
 * 1）程序执行一个函数时，就创建一个新的受保护的独立空间(新函数栈)
 * 2）函数的局部变量是独立的，不会相互影响
 * 3）递归必须向退出递归的条件逼近，否则就是无限递归，死龟了
 * 4）当一个函数执行完毕，或者遇到return，就会返回，遵守谁调用，就将结果返回给谁
 * @author chenhuiup
 * @create 2020-09-13 8:42
 */
object Demo01 {
  def main(args: Array[String]): Unit = {
    test(4)
    test2(4)
  }

  def test(n: Int){
    if (n > 2) {
      test(n - 1)
    }
    println("n = " + n) // 2 , 3 ,4
  }

  def test2(n: Int){
    if (n > 2) {
      test2(n - 1)
    }else{
      println("n = " + n) // 2
    }
  }

}
