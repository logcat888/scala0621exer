package com.atguigu.scala.chapter05.myexception

/**
 * scala沿用了Java的异常体系
 *
 * 语法：
 * //说明
 * //1. 在scala中只有一个catch
 * //2. 在catch中有多个case，每个case可以匹配一种异常  case ex: Exception => println("捕获了异常")
 * //3. => 关键符号，表示后面是对该异常的处理代码块
 * //4. finally 最终要执行的
 *
 * scala 异常处理小结：
 * 1） 我们将可以代码封装在try中，在try块之后使用了一个catch处理程序来捕获异常。如果发生任何异常，catch处理程序
 *     将处理它，程序将不会异常终止。
 *  2)  scala的异常的工作机制和Java一样，但是scala没有“checked(编译期)”异常，即scala没有编译异常这个概念，
 *     异常都是在运行的时候捕获处理。
 *  3）用throw关键字，抛出一个异常对象。所有异常都是Throwable的子类型。throw表达式是有类型的，就是Nothing，
 *     因为Nothing是所有类型的子类型，所以throw表达式可以用在需要类型的地方。
 *  4) 在scala中，借用了模式匹配的思想来做异常的匹配，因此，在catch的代码里，是一系列case子句来匹配异常。
 *     当匹配上后， => 有多条语句可以换行写，类似java的switch case x ： 代码块。
 *  5） 异常捕获的机制与其他语言中一样，如果有异常发生，catch子句是按次序捕获的。因此，在catch子句中，越具体的异常
 *     越要靠前，越普遍的异常越靠后，如果把越普遍的异常写在前，把具体的异常写在后，在scala中也不会报错，但是这样是
 *       非常不好的编程风格。
 *   6） finally子句用于执行不管是正常处理还是有异常发生时都需要执行的步骤，一般用于对象的清理工作，这点和java一样
 *   7） scala提供了throws关键字来声明异常，可以使用方法定义声明异常，它向调用者函数提供了此方法
 *      可能引发此异常的信息，它有助于调用函数处理并将该代码包含在try-catch块中，以避免程序异常终止。
 *      在scala中，可以使用throws注释来声明异常。
 *
 * @author chenhuiup
 * @create 2020-09-13 13:33
 */
object ScalaExceptionDemo {
  def main(args: Array[String]): Unit = {
    try {
      val r = 10 / 0
    } catch {
      //说明
      //1. 在scala中只有一个catch
      //2. 在catch中有多个case，每个case可以匹配一种异常  case ex: Exception => println("捕获了异常")
      //3. => 关键符号，表示后面是对该异常的处理代码块
      //4. finally 最终要执行的
      case ex: ArithmeticException => {
        println("捕获了除数为零的算数异常")
      }
      case ex: Exception => println("捕获了异常")
    } finally {
      // 最终要执行的代码
      println("scala finally")
    }

    println("我是核心代码~~~")
  }

}
