package com.ddb.javacore.flow;

import java.util.Scanner;

public class BranchDemo {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("请输入Java课程分数:");
		int score = input.nextInt();
		// 如果...就...的单路分支
		if (score > 90) {
			// 只有括号里的表达式值为true，才会执行大括号里的语句！
			System.out.println("考的不错，老师奖励一个MP4！");
		}

		// 如果...否则...的双路分支
		if (score >= 60) {
			System.out.println("不错，考试及格了。");
		} else {
			System.out.println("小样不及格，等着补考吧！！");
		}

		// 如果...否则...连接的多路分支;
		if (score >= 90) {
			System.out.println("很好，成绩优秀！");
		} else if (score >= 80) {
			System.out.println("很好，成绩良好！");
		} else if (score >= 70) {
			System.out.println("很好，成绩中等！");
		} else if (score >= 60) {
			System.out.println("还行，及格了！");
		} else {
			System.out.println("不及格，等着补考吧！");
		}

		// 三目运算符 ? :
		String result = score > 60 ? "及格" : "不及格";
		System.out.println("result :" + result);

		System.out.println("执行结束！");

	}

}
