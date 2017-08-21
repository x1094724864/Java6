package com.ddb.javacore.operator;

public class OperatorDemo {

	public static void main(String[] args) {
		// 算术运算
		int a = 32;
		int b = 5;
		// syso + alt +/ 可以快速完成System.out.println();的输入
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a + b =" + a + b);
		// 通过使用()来改变运算顺序
		System.out.println("a + b =" + (a + b));
		System.out.println("a - b =" + (a - b));
		System.out.println("a * b =" + (a * b));
		System.out.println("a / b =" + (a / b));
		System.out.println("a % b =" + (a % b)); // 取余数运算

		// 关系运算
		System.out.println("a > b :" + (a > b));
		System.out.println("a >= b :" + (a >= b));
		System.out.println("a == b :" + (a == b));
		System.out.println("a < b :" + (a < b));
		System.out.println("a <= b :" + (a <= b));
		System.out.println("a != b :" + (a != b));
		// System.out.println("a >< b :" + (a >< b)); //不支持

		// 逻辑运算
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("bl ==" + b1);
		System.out.println("b2 ==" + b2);
		System.out.println("b1 && b2 :" + (b1 && b2));	//相与
		System.out.println("b1 || b2 :" + (b1 || b2));	//相或
		System.out.println(" !b2 :" + (!b2));	//取反，取非

		boolean b3 = true;
		System.out.println("b3 ==" + b3);
		System.out.println("b1 && b3 :" + (b1 && b3));	//相与
		System.out.println("b1 || b3 :" + (b1 || b3));	//相或
		
		//三目运算符  ？  :
		
		
	}

}
