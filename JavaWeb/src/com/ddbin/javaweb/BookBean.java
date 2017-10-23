package com.ddbin.javaweb;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class BookBean {
	private String bookName = "";
	private int bookNum = 1;
	
	//创建自定义的构造函数
	public BookBean() {
		
	}
	public BookBean(String bookName, int bookNum) {
		this.bookName = bookName;
		this.bookNum = bookNum;
	}
	
	//创建需要的getter和Setter方法
	

}
