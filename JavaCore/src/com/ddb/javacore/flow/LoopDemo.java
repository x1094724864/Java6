package com.ddb.javacore.flow;

public class LoopDemo {

	public static void main(String[] args) {
		// while循环 ----先判断条件，再决定是否执行循环
		//int i = 1;
		/*while (i <= 100) {
			System.out.println("第" + i + "遍:好好学习，天天向上！");
			// i = i + 1;
			// i += 1;
			i++;
		}*/
		
		// do...while循环，先执行循环体一次，然后再判断循环条件是否成立----有点类似与先斩后奏
//		int i = 101;
//		do {
//			System.out.println("第" + i + "遍:好好学习，天天向上！");
//			i ++;
//		} while (i<=100);
		
		/*
		 * 总结：
		 * do...while循环可以替代while循环，
		 * 两者区别是，do...while至少执行一次循环体，while可能一次都不会执行！
		 */
	
		//传统的for循环
//		int i;
//		for (i=1; i <=100; i++) {
//			System.out.println("第" + i + "遍:好好学习，天天向上！");
//			//i++;	//自增在循环体中也是可以的
//		}
		
		//for循环的初始变量可以在for外面定义，也可以在括号里定义
		for (int j = 1; j <= 100; j++) {
			System.out.println("第" + j + "遍:好好学习，天天向上！");
		}
		
	}

}
