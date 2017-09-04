package com.ddb.javacore.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {

	@SuppressWarnings("all") // 压制所有的警告
	public static void main(String[] args) {
		// 使用Map接口
		Map countries = new HashMap();
		// 向Map中添加元素
		countries.put("CN", "中华人民共和国");
		countries.put("RU", "俄罗斯联邦");
		countries.put("FR", "法兰西共和国");
		countries.put("US", "美利坚合众国");
		System.out.println("Map 元素如下：");
		System.out.println(countries);

		Set entrys = countries.entrySet();

		// Map容器的遍历方式----循环的方式
		System.out.println("使用Foreach遍历：");
		for (Object object : entrys) {
			System.out.println(object);
		}

		//
		Set keys = countries.keySet();
		Iterator iterator = keys.iterator();
		System.out.println("使用迭代器遍历：");
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.print(key);
			// 通过key去获取对应的value
			String value = (String) countries.get(key);
			System.out.print("----" + value);
			System.out.println();
		}

	}

}
