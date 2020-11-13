//代码说明
//1. package com.atguigu{} 表示我们创建了包com.atguigu，在{}中我们可以继续写
//     1）他的子包 scala //com.atguigu.scala
//     2）还可以写类，特质trait，object
// 2. 即scala支持（包中有包），在一个文件中，可以同时创建多个包，以及给各个包创建类，trait 和 object 。这样就非常灵活
// 3. 作用域原则：可以直接向上访问。即：scala中子包可以直接访问父包中的内容，大括号体现作用域。
//    （提示：java中子包使用父包的类，需要import）。
//    在子包和父包类重名时，默认采用就近原则，如果希望指定使用某个类，则带上包名即可。
// 4. 父包要访问子包的内容时，需要import对应的类等
// 5. 可以在同一个.scala文件中，生命多个并列的package（建议嵌套的package 不要超过3层）
// 6. 包名可以相对也可以绝对，比如，访问BeanProperty的绝对路径是:_root_.scala.beans.BeanProperty,
//     在一般情况下：我们使用相对路径来引入包，只有当包名冲突时，使用绝对路径来处理。
// 7. 为什么要有包对象： 包可以包含类、对象和特质trait，但是不能包含函数/方法或者变量的定义，这是java虚拟机的局限
// *  （jvm认为一个函数/方法/遍历应该归属于一个对象）。为了弥补这点不足，scala提供了包对象的概念来解决这个问题。
// 8. 在包中直接写方法，或者定义变量，就报错 => 使用包对象的技术来解决。

/*
包对象说明：
1.在包中直接写方法，或者定义变量，就报错 => 使用包对象的技术来解决
2.package object scala表示创建一个包对象scala，他是com.atguigu.scala这个包对象的包对象
3.每个包都可以有一个包对象，且只能有一个，因为底层生成的两个类的名字是package 和package$
4.包对象的名字需要和子包一样
5.在包对象中可以定义变量，方法
6.在包对象中定义的变量和方法，就可以在对应的包中使用

包对象的底层实现机制分析（重点） （反编译看出的）
1）当创建包对象后，在该包下生成两个类public final class package 和 public final class package$
2）通过package$ 的一个静态实例完成对包对象中的属性和方法的调用

包对象的注意事项：
1）每个包都可以有一个包对象，你需要在父包中定义它。
2）包对象名称需要和包名一致，一般用来对包的功能补充

 */

package com.atguigu{ //包com.atguigu
  class User{ // 在com.atguigu包下创建个 User类
      def sayHello():Unit={
        //想使用com.atguigu.scala2包下的Monster
        import com.atguigu.scala2.Monster
        val monster = new Monster
      }
  }

  package scala2{ //创建包 com.atguigu.scala2
    class User{ //在com.atguigu.scala2 包下创建个 User类
    }
    class Monster{}
  }
  //说明：
  // 1.在包中直接写方法，或者定义变量，就报错 => 使用包对象的技术来解决
  // 2.package object scala表示创建一个包对象scala，他是com.atguigu.scala这个包对象的包对象
  // 3.每个包都可以有一个包对象
  // 4.包对象的名字需要和子包一样
  // 5.在包对象中可以定义变量，方法
  // 6.在包对象中定义的变量和方法，就可以在对应的包中使用
  package object scala{
    val name = "king"
    def sayHi():Unit={
      print("package object scala sayHi \n")
    }
  }

  package scala{ // 包 com.atguigu.scala
    class Person5{ // 表示在 com.atguigu.scala下创建类 Person5
      val name = "Nick"
      def play(message:String): Unit ={
        println(this.name + " " +message)
      }
    }

    class User{

    }

    object Test3{ //表示在 com.atguigu.scala下创建  object Test3
      def main(args: Array[String]): Unit = {
        println("ok")
        println("使用name = " + name)
        //使用包对象的方法
        sayHi()

        //我们可以直接使用父包的内容,如果本包没有重名的类
        //1.如果有同名的类，则采用就近原则来使用内容（比如包）
        //2.如果就是要使用父包的类，则指定路径即可。
        val user = new User
        println("user = " + user) //user = com.atguigu.scala.User@66d33a

        val user2 = new com.atguigu.User
        println("user2 = " + user2)  //user2 = com.atguigu.User@7cf10a6f
      }
    }
  }
}
