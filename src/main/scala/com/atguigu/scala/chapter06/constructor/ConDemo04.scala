package com.atguigu.scala.chapter06.constructor

/**
 * 属性高级部分
 *  1）Scala类的主构造器的形参未用任何修饰符修饰，那么这个参数局部变量。
 *  2）如果参数使用val关键字声明，那么scala会将参数作为类的私有的只读属性使用。 只提供了一个可读的方法，没有setter方法。
 *  3）如果参数使用var关键字声明，那么scala会将参数作为类的成员属性使用，并会提供属性对应的xxx(),
 *     并会提供属性对应的xxx()[类似getter] / xxx_$eq()[类似setter]]方法，即这时的成员属性是私有的，但是可读写。
 *
 * @author chenhuiup
 * @create 2020-09-13 20:47
 */
object ConDemo04 {
  def main(args: Array[String]): Unit = {

    val worker = new Worker("赵丽颖")
    worker.name //不能访问 inName

    val  worker2 = new Worker2("陈钰琪")
    worker2.inName  //可以访问 inName,但是不能修改

    val  worker3 = new Worker3("三上悠亚")
    worker3.inName = "九重环奈"  //可以访问 inName,也可以修改
    println(worker3.inName)

  }
}
//1.如果 主构造器是Worker(inName:String){} ，那么inName就是一个局部变量
class Worker(inName:String){
  var name = inName;
}

//2.如果 主构造器是 Worker2( val inName:String){} ，那么inName就是worker2的一个private的只读属性
class Worker2( val inName:String){
  var name = inName;
}

//2.如果 主构造器是 Worker3( var inName:String){} ，那么inName就是worker3的一个private的可读写的属性
class Worker3( var inName:String){
  var name = inName;
}

/*
public class Worker
{
  private String name;

  public String name()
  {
    return this.name; }
  public void name_$eq(String x$1) { this.name = x$1; }
  public Worker(String inName) { this.name = inName; }

}
 */

/*
public class Worker2
{
  private final String inName;  //inName成为了属性
  private String name;

//inName只读----------------------
  public String inName()
  {
    return this.inName; }
  public String name() { return this.name; }
  public void name_$eq(String x$1) { this.name = x$1; }
  public Worker2(String inName) { this.name = inName; }

}
 */

/*
public class Worker3
{
  private String inName;
  private String name = inName();

  public String inName()
  {
    return this.inName; }
  public void inName_$eq(String x$1) { this.inName = x$1; }
  public String name() { return this.name; }
  public void name_$eq(String x$1) { this.name = x$1; }


  public Worker3(String inName)
  {
  }
}
 */