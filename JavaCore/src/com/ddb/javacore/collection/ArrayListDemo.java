package com.ddb.javacore.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// 演示ArrayList
		Dog ououDog = new Dog("欧欧");
		List dogs = new ArrayList<Dog>();
		// 向容器中添加元素
		dogs.add(ououDog);
		dogs.add(new Dog("yaya"));
		dogs.add(new Dog("meimei"));
		dogs.add(0, new Dog("awang")); // 在指定的位置添加元素

		System.out.println("共有：" + dogs.size() + "条狗狗！");
		printList(dogs);

		Dog yayaDog = new Dog("yaya");
		// 判断是否包含指定的狗狗
		if (dogs.contains(yayaDog)) {
			System.out.println("容器中包含指定的狗狗");
		} else {
			System.out.println("容器中不包含指定的狗狗");
		}

		// 删除容器中第2个元素
		System.out.println("删除容器中第2个元素");
		dogs.remove(1);
		printList(dogs);
		// 删除指定的狗狗
		System.out.println("删除指定的ouou狗狗");
		dogs.remove(ououDog);
		printList(dogs);

	}

	public static void printList(List dogs) {
		System.out.println("分别是：");
		for (int i = 0; i < dogs.size(); i++) {
			// 获取每个狗狗，进行打印
			Dog dog = (Dog) dogs.get(i);
			// 输出dog的信息
			System.out.println(dog);
		}
	}

}
