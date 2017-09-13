package com.ddb.javacore.enumdemo;

import java.util.EnumSet;

public class Test {

	public static void main(String[] args) {
		// 遍历枚举的所有实例
		// System.out.println("输出WeekEnum:");
		// for (WeekEnum we : WeekEnum.values()) {
		// System.out.println(we);
		// System.out.println(we.name() + "----" + we.ordinal());
		// }

		// 遍历枚举的所有实例
		System.out.println("输出WeekEnum2:");
		for (WeekEnum2 we : WeekEnum2.values()) {
			System.out.println(we);
			System.out.println(we.name() + "----" + we.ordinal() + ",是否休息：" + we.isRest());
		}

		// 遍历SeasonEnum
		System.out.println("输出SeasonEnum:");
		for (SeasonEnum se : SeasonEnum.values()) {
			System.out.println(se);
			se.printSelf();
		}

		// 和switch...case搭配使用
		System.out.println("-----------------------------------------");
		SeasonEnum seasonEnum = SeasonEnum.SPRING;
		switch (seasonEnum) {
		case SPRING:
			printSeason(seasonEnum);
			break;
		case SUMMER:
			printSeason(seasonEnum);
			break;
		case AUTUMN:
			printSeason(seasonEnum);
			break;
		case WINTER:
			printSeason(seasonEnum);
			break;
		default:
			break;
		}

		// EnumSet demo
		System.out.println("EnumSet :");
		EnumSet<SeasonEnum> seasonSet = EnumSet.allOf(SeasonEnum.class);	//将枚举实例转换为Set集合的元素
		for (SeasonEnum seasonEnum2 : seasonSet) {
			System.out.println(seasonEnum2);
		}

	}

	private static void printSeason(SeasonEnum seasonEnum) {
		System.out.println(seasonEnum);
		System.out.println(seasonEnum.getSeasonName() + "++++" + seasonEnum.getSeasonDesc());
	}

}
