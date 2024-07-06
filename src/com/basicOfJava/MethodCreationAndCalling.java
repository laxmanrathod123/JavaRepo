package com.basicOfJava;

public class MethodCreationAndCalling {
	int a = 10, b = 100, sum;
	static int x = 20, y = 30;

	public static void addition() {
		System.out.println("addition Start");
		MethodCreationAndCalling obj = new MethodCreationAndCalling();
		obj.sum = obj.a + obj.b;
		System.out.println("sum:" + obj.sum);
	
		
		System.out.println("Addition of static variable");
		obj.sum = MethodCreationAndCalling.x + MethodCreationAndCalling.y;
		System.out.println("sum:" + obj.sum);
		System.out.println("addition End");
	}

	public void subtracion() {
		System.out.println("subtracion Start");
		Test();
		int subtraction= a-b;
		System.out.println("subtracion="+subtraction);
		System.out.println("subtracion End");
	}

	public static void Test() {
		System.out.println("Test method start");
		System.out.println("I am in Test Method");
		System.out.println("Test method end");
	}

	public static void main(String[] args) {
		System.out.println("Program Start");
		MethodCreationAndCalling.addition();
		System.out.println("Program End");
		System.out.println();
		MethodCreationAndCalling obj = new MethodCreationAndCalling();
		obj.subtracion();
	}

}
