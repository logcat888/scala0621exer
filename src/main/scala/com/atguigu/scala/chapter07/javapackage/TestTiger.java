package com.atguigu.scala.chapter07.javapackage;

/**
 * java包的三大作用
 *  1）区分相同名字的类
 *  2）当类很多时，可以很好的管理类
 *  3）控制访问的范围
 *
 *  打包的本质：实际上就是创建不同的文件夹来保存类文件
 *
 * @author chenhuiup
 * @create 2020-09-13 22:57
 */
public class TestTiger {
    public static void main(String[] args) {
        //使用xm的Tiger
        com.atguigu.scala.chapter07.javapackage.xm.Tiger xmTiger =
                new com.atguigu.scala.chapter07.javapackage.xm.Tiger();

        //使用xh的Tiger
        com.atguigu.scala.chapter07.javapackage.xh.Tiger xhTiger =
                new com.atguigu.scala.chapter07.javapackage.xh.Tiger();

        System.out.println("xm = " + xmTiger);
        System.out.println("xh = " + xhTiger);
    }
}
