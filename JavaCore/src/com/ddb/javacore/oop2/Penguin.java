package com.ddb.javacore.oop2;

import com.sun.javafx.binding.StringFormatter;

public class Penguin {
	String name = "QQ";
	String sex = "Q仔";
	int love = 20;

	// 如果不显式定义构造函数，则系统默认存在无参的构造函数
	// 如果显式定义了，则默认的就不存在了

//	public Penguin() {
//		// name = "QQ";
//		// sex = "Q仔";
//		// love = 20;
//		// 等效于给成员属性赋值
//	}

	// 定义有参数的构造函数
	public Penguin(String name, String sex, int love) {
		//this 表示的是当前对象
		this.name = name;
		this.sex = sex;
		this.love = love;
		System.out.println("Penguin的有参构造函数已执行！");
	}

	@Override
	public String toString() {
		return "Penguin [name=" + name + ", sex=" + sex + ", love=" + love + "]";
	}

}
