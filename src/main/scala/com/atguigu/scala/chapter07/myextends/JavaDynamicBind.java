package com.atguigu.scala.chapter07.myextends;

/**
 * @author chenhuiup
 * @create 2020-09-17 20:13
 */
/*
java 的动态绑定机制的小结
1. 如果调用的是方法，则jvm会将该方法和对象的内存地址绑定
2. 如果调用的是一个属性，则没有动态绑定机制，在哪里调用，就返回对应的值
 */
public class JavaDynamicBind {
    public static void main(String[] args) {
        A1 a = new B1();
        System.out.println(a.sum());  // 40
        System.out.println(a.sum1()); // 30

    }
}
class A1{
    public int i = 10;
    public int sum() {
        return getI() + 10;
    }
    public int sum1() {
        return i + 10;
    }
    public int getI() {
        return i;
    }
}

class B1 extends A1 {
    public int i = 20;
    public int sum() {
        return i + 20;
    }
    public int getI() {
        return i;
    }
    public int sum1() {
        return i + 10;
    }
}

