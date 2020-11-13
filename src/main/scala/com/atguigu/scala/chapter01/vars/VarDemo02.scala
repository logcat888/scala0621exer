package com.atguigu.scala.chapter01.vars

/**

 * @author chenhuiup
 * @create 2020-09-11 19:35
 */
object VarDemo02 {
  def main(args: Array[String]): Unit = {
    //类型推导
    var num = 10 //这时num就是Int
    //方式1 可以利用idea提示
    //方式2，使用isInstanceOf[Int]判断
    println(num.isInstanceOf[Int])//true

    //类型确定后，就不能修改，说明scala是强数据类型语言,编译器已经将类型写进去。而动态类型语言就可以修改类型
    //num = 2.3

    //在声明/定义一个变量时，可以使用var或者val来修饰，var修饰的变量可改变，val修饰的变量不可改。
    var age = 10 //即age是可以改变的
    age = 30

    val num2 = 30
    //    num2 = 40// val 修饰的变量是不可以改变的

    //scala设计者为什么设计 var 和val
    // （1） 在实际编程，我们更多的需求是获取/创建一个对象后，读取该对象的属性，
    //       或者是修改对象的属性值，但是我们很少去改变这个对象本身
    //       比如： dog = new Dog（）  dog.age = 10    dog = new Dog()
    //       这时，我们就可以使用val
    //  (2)  因为val没有线程安全问题，因此效率高，scala的设计者推荐我们val
    //  （3） 如果对象需要改变，则使用var

    val dog = new Dog
    //    dog = new Dog // Reassignment to val
    dog.age = 90 //ok
    //    dog.name = "小米"//ok
  }
}
class Dog{
  //声明一个age属性，给了一个默认值_
  var age :Int =_

  //声明名字
  val name:String = ""
}
