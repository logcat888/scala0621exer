package com.atguigu.scala.chapter07.abstractdemo

/**
 * @author chenhuiup
 * @create 2020-09-17 15:12
 */
object BankDemo {
  def main(args: Array[String]): Unit = {
    //开卡
    val account = new Account("123456",77777,123456)
    account.query(123456)
    account.withdraw(123456,500)
    account.quKuan(123456,15)
  }

}

class Account(inAccountNo: String, inBalance: Double, passwd: Int) {
  /*
  属性：账号，密码，余额
  方法：存款，取款，查询
   */

  val accountNo = inAccountNo
  var balance = inBalance
  var password = passwd

  //查询
  def query(pwd: Int) = {
    if (this.password != pwd) {
      println("输入的密码有误")
    } else {
      println(s"当前账号$accountNo 的余额为$balance")
    }
  }

  //取款
  def withdraw(pwd: Int,money: Double) = {
    if (this.password != pwd) {
      println("输入的密码有误")
    } else {
      if (this.balance < money) {
        println("余额不足")
      } else {
        balance -= money
        println(s"$money 取款成功，余额为$balance")
      }
    }
  }

  //存款
  def quKuan(pwd: Int,money: Double) = {
    if (this.password != pwd) {
      println("输入的密码有误")
    } else {
      balance += money
      println(s"$money 存款成功，余额为$balance")

    }
  }
}
