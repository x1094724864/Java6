package com.ddb.javacore.exception;

import java.util.Scanner;

public class ExceptionDemo {

	private static Scanner in;

	public static void main(String args[]) {
		in = new Scanner(System.in);
		System.out.print("请输入被除数:");

		int num1 = in.nextInt();
		System.out.print("请输入除数:");
		int num2 = in.nextInt();
		try {
			// 这里放置可能出现异常的代码
			System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));
			// TODO: handle exception
		} catch (ArithmeticException e) {
			// 异常出现，对应的处理方案
			System.out.println("发生了算术异常");
		} catch (Exception e) {
			// 异常出现，对应的处理方案
			//其他所有的异常情况，都是用下面的解决方案
			System.out.println("程序执行出现了异常！");
			e.printStackTrace();
			
			//异常的顺序，要注意：子异常在前面，父异常在后面，一定不能反！
		}

		System.out.println("感谢使用本程序！");

	}

}
