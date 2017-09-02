package com.ddb.javacore.array;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// 声明一个数组，并分配空间长度为5
		int[] scores = { 65, 54, 90, 75, 83 };
		System.out.println("数组原始序列：");
		outputArray(scores);
		// 对数组进行排序
		// Arrays.sort(scores);
		/*
		 *  对数组的指定范围进行排序
		 *  对指定 int 型数组的指定范围按数字升序进行排序。
		 *  排序的范围从索引 fromIndex（包括）一直到索引 toIndex（不包括）。
		 *  （如果 fromIndex==toIndex，则排序范围为空。）
		 */
		Arrays.sort(scores, 1, 4);
		
		System.out.println("数组排序后");
		outputArray(scores);

	}

	// 使用重构的工具，抽取通用的代码作为方法，实现修改的便利性
	private static void outputArray(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}
		System.out.println();
	}

}
