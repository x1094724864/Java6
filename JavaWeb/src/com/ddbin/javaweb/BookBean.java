package com.ddbin.javaweb;

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
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

}
