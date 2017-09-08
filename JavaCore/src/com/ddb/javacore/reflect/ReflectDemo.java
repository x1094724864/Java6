package com.ddb.javacore.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		//要想使用反射，要现有clazz对象！！！
		
		// 得到Class类的实例对象
		// 第一种方式：类名.class；
		Class clazz = Student.class;
		// 第二种方式：对象.getClass();
		// Class class1 = new Student().getClass();
		Student student = new Student();
		Class clazz2 = student.getClass();
		// 第三种方式：Class.forName();
		Class clazz3 = Class.forName("com.ddb.javacore.reflect.Student");

		// com.ddb.javacore.reflect.Student
		System.out.println("clazz.getName():" + clazz.getName());
		// class java.lang.Object
		System.out.println("clazz.getSuperclass():" + clazz.getSuperclass());
		// Student
		System.out.println("clazz.getSimpleName():" + clazz.getSimpleName());
		// If this class does not represent an array class this method returns null.
		System.out.println("clazz.getComponentType():" + clazz.getComponentType());
		// [Ljava.lang.Class;@7dc5e7b4
		System.out.println("clazz.getInterfaces():" + clazz.getInterfaces().toString());

		// com.ddb.javacore.reflect.Student
		System.out.println("clazz.getCanonicalName():" + clazz.getCanonicalName());
		// 返回反射类所有的构造器
		Constructor[] constructors = clazz.getConstructors();
		System.out.println("Student类，有" + constructors.length + "个构造函数！");
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}

		System.out.println("Student类，有" + clazz.getDeclaredMethods().length + "个声明的方法！");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}

		System.out.println("Student类，有" + clazz.getDeclaredFields().length + "个声明的成员属性！");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}

	}

}
