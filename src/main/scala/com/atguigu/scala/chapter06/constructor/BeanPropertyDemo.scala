package com.atguigu.scala.chapter06.constructor

import scala.beans.BeanProperty

/**
 * Bean属性：
 * javaBeans规范定义了Java的属性是像getXxx（） 和 setXxx() 的方法。许多Java工具（框架）都依赖这个命名习惯.
 * 为了Java的互操作性。将Scala字段加@BeanProperty时，这样会自动生成规范的setXxx/getXxx方法。这时可以使用
 * 对象.setXxx()和对象.getXxx（）来调用属性。
 *
 * 注意：给某个属性加入@BeanProperty注解后，会生成getXXX和setXXX的方法，并且对原来底层自动生成类似xxx（），xxx_$eq（）方法，
 * 没有冲突，二者可以共存。
 *
 * @author chenhuiup
 * @create 2020-09-13 21:10
 */
object BeanPropertyDemo {
  def main(args: Array[String]): Unit = {
    val car = new Car
    car.name = "宝马"
    println(car.name)

    //使用@BeanProperty  自动生成getXxx 和 setXxx
    car.setName("红旗")
    println(car.getName)
  }

}

class Car {
  @BeanProperty var name: String = null
}

/*
public class Car
{
  private String name = null;

  public String name() { return this.name; }
  public void name_$eq(String x$1) { this.name = x$1; }
  public String getName() { return name(); }
  public void setName(String x$1) { name_$eq(x$1); }

}
 */