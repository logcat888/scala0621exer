package com.atguigu.scala.chapter05.myexception;

/**
 * java中不可以把返回大的异常写在前面，否则报错
 * @author chenhuiup
 * @create 2020-09-13 13:24
 */
public class JavaExceptionDemo01 {
    public static void main(String[] args) {
        try {
            //可疑代码
            int i = 0;
            int b = 10;
            int c = b / i; //执行代码时，会抛出ArithmeticException
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //最终要执行的代码
            System.out.println("java finally");
        }

        System.out.println("核心代码，受到保护");

    }
}
