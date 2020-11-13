package com.atguigu.scala.chapter07.myextends;

/**
 * @author chenhuiup
 * @create 2020-09-17 19:17
 */
public class JavaBaseConstructor {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    public A() {
        System.out.println("A()");
    }
    public A(String name) {
        System.out.println("A(String name)" + name);
    }
}
class B extends A{
    public B() {
        //这里会隐式调用super(); 就是无参的父类构造器A()
        System.out.println("B()");
    }
    public B(String name) {
        super(name);
        System.out.println("B(String name)" + name);
    }
}

