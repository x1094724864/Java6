package com.ddb.javacore.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {

	private static Scanner in;

	public static void main(String args[]) {

		System.out.println("欢迎使用新安牌计算器！");
		int result = divMethod();
		System.out.println("方法执行的返回值为：" + result);
		switch (result) {
		case 0:
			System.out.println("0---正常结束！");
			break;
		case 1:
			System.out.println("1---发生了 算术异常");
			break;
		case 2:
			System.out.println("2---发生了 输入不匹配异常");
			break;
		case 3:
			System.out.println("3---发生了其他异常");
			break;
		default:
			System.out.println("4---执行到finally语句块");
			break;
		}

		System.out.println("感谢使用本程序！");

	}

	private static int divMethod() {
		in = new Scanner(System.in);
		System.out.print("请输入被除数:");
		try {
			int num1 = in.nextInt();
			System.out.print("请输入除数:");
			int num2 = in.nextInt();
			// 这里放置可能出现异常的代码
			System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));
			return 0; // 0表示正常结束！
		} catch (ArithmeticException e) {
			// 异常出现，对应的处理方案
			System.out.println("发生了算术异常");
			System.out.println(e.getMessage()); // getMessage显示的信息比较简短
			// e.printStackTrace();
			// System.exit(1); //退出JVM虚拟机，所以后面的代码就没有机会执行！
			return 1; // 1 表示发生了 算术异常
		} catch (InputMismatchException e) {
			// 异常出现，对应的处理方案
			System.out.println("发生了输入不匹配异常");
			e.printStackTrace(); // 显得异常信息就非常详细，对于调试程序非常有帮助！
			return 2; // 1 表示发生了 输入不匹配异常
		} catch (Exception e) {
			// 异常出现，对应的处理方案
			// 其他所有的异常情况，都是用下面的解决方案
			System.out.println("程序执行出现了异常！");
			e.printStackTrace();
			// 异常的顺序，要注意：子异常在前面，父异常在后面，一定不能反！
			return 3; // 3 发生了其他异常
		} finally {
			System.out.println("我在finally 语句块里面，你见到我就说明，我已经被执行了！");
			return 4; // 4 表示执行到finally语句块
		}

		// return 5; 死码！
	}

}
