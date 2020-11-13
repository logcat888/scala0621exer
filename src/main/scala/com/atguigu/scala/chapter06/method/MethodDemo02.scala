package com.atguigu.scala.chapter06.method

/**
 * @author chenhuiup
 * @create 2020-09-13 18:54
 */
object MethodDemo02 {
  def main(args: Array[String]): Unit = {
    val m1 = new MethodExec
    m1.printStar()
    m1.width = 2.5
    m1.length = 3.9
    println(m1.eara())

  }

}

class MethodExec{
  var length:Double = _
  var width:Double = _
  def printStar(){
    for (i <- Range(1,10)){
      println("*" * 8)
    }
  }

  //计算面积的方法
  def eara():Double={
    (this.length * this.width).formatted("%.2f").toDouble
  }
}
