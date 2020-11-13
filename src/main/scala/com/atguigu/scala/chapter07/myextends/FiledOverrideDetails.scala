package com.atguigu.scala.chapter07.myextends

/**
 * @author chenhuiup
 * @create 2020-09-17 20:41
 */
object FiledOverrideDetails {
  def main(args: Array[String]): Unit = {
    println("xxx")
    val bbbb = new BBBB
    // 假如bbbb.name = "jack"成立， 相当于调用了 父类的name_$eq()
    // println(bbbb.name)相当于调用了子类的name()
    // 这样出现数据设置和数据获取不一致，严重的逻辑错误
  }
}

class AAAA{
//  var name:String = "" //底层会生成public name() 和 public name_$eq()
  val name:String = "" //底层会生成public name() 和 public name_$eq()
}

class BBBB extends AAAA{
  override val name:String = "jjj" //底层只会生成一个 public name()
}
