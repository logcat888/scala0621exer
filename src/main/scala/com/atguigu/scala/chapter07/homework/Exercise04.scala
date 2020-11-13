package com.atguigu.scala.chapter07.homework



/**
 * @author chenhuiup
 * @create 2020-09-17 16:11
 */
object Exercise04 {
  def main(args: Array[String]): Unit = {
    import java.util.{HashMap => JavaHashMap}
    import scala.collection.mutable.{HashMap => ScalaHashMap}
    val javaHashMap = new JavaHashMap[Int,String]()
    javaHashMap.put(1,"one")
    javaHashMap.put(2,"Two")
    javaHashMap.put(3,"Three")
    javaHashMap.put(4,"Four")
    val scalaHashMap = new ScalaHashMap[Int,String]()
    /*
    说明：
    1. javaHashMap.keySet().toArray，这里是将javaMap的key转成数组
    2. key.asInstanceOf[Int] : 将key转成Int类型
    3. javaHashMap.get(key) ,得到这个key对应value
    4. (key.asInstanceOf[Int] -> javaHashMap.get(key)) 是key -> value
    5. += 将key -> value加入到scalaHashMap
     */
    for (key <- javaHashMap.keySet().toArray)
      scalaHashMap += (key.asInstanceOf[Int] -> javaHashMap.get(key))

    println(scalaHashMap)
  }



}
