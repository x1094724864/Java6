package com.ddb.javacore.enumdemo;

public enum WeekEnum2 { // 使用 enum 定义的枚举类默认继承了 java.lang.Enum 类
	// 定义枚举实例
	MON, TUE, WED, THU, FRI, SAT {
		// 提供判断是否休息的方法
		public boolean isRest() {
			return true;// 默认休息
		}
	},
	SUN {
		// 提供判断是否休息的方法
		public boolean isRest() {
			return true;// 默认休息
		}

	};// 如果没有其他属性或者方法等，可以不写；，如果有一定要写；

	// 提供判断是否休息的方法
	public boolean isRest() {
		return false;// 默认休息
	}

}
