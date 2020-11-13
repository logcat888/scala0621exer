package com.atguigu.scala.chapter08;

/**
 * 有一群小孩在玩堆雪人,不时有新的小孩加入,请问如何知道现在共有多少人在玩?
 * 请使用面向对象的思想，编写程序解决
 * @author chenhuiup
 * @create 2020-09-17 22:45
 */
public class Test01_ChildGame {
    public static void main(String[] args) {
        Child01 child1 = new Child01();
        Child01 child2 = new Child01();
        Child01 child3 = new Child01();
        Child01 child4 = new Child01();
        System.out.println(child1.getChildCount());
    }
}

class Child01{
    private static int childCount = 0;

    public Child01(){
        childCount++;
    }

    public int getChildCount(){
        return childCount;
    }
}
