package com.atguigu.scala.chapter07.myextends

/**
 * @author chenhuiup
 * @create 2020-09-17 20:51
 */
/*
覆写字段的注意事项和细节
1）def只能重写另一个def(即：方法只能重写另一个方法)
2）val只能重写另一个val 属性 或 重写不带参数的def

在scala中一切皆函数，就连属性都被封装成方法，可以在子类中用val 属性 重写一个父类无参方法。
 */
object FiledOverrideDetails02 {
  def main(args: Array[String]): Unit = {
    val test = new BBBBB
    println(test.sal) // 5
    test.hello() //10

    //动态绑定
    val test2:AAAAA = new BBBBB
    println("test2.sal = " + test2.sal()) //test2.sal = 5
  }
}

class AAAAA{
  def sal():Int = 10
}

class BBBBB extends AAAAA{
  override val sal: Int = 5 // 底层生成 public sal()

  def hello()={
    println(super.sal())
  }
}
