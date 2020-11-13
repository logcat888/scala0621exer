package com.atguigu.scala.chapter05.myexception

/**
 * @author chenhuiup
 * @create 2020-09-13 13:54
 */
object ThrowDemo {
  def main(args: Array[String]): Unit = {
    //val res = test()
//    println(res.toString)

    //如果我们希望再test() 抛出异常后，代码可以继续执行，则我们需要处理
    try {
      test()
    } catch {
      case  ex: Exception=> {
        println("捕获到异常" + ex.getMessage())
        println("哈哈哈哈，打倒日本帝国主义")
      }
      case ex:ArithmeticException => println("哈哈哈哈")
    }finally{
      //写上对try{}中的资源的分配
      //比如在大数据领域，打开一个大文件，指针的资源。 缓冲的释放

    }

    print("ok~~~~~")
  }

  def test():Nothing = {
    throw new Exception("异常No1出现")
  }

}
