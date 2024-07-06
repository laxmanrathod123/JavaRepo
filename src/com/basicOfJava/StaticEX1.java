package com.basicOfJava;

public class StaticEX1 {
	//Static should be variable,method,class,object
	int a=10;
	public static void main(String[]args)
	{
		System.out.println("Program Start");
		
		int a=100;
		System.out.println("Local variable:"+a);// local variable inside the method
		
		StaticEX1 obj= new StaticEX1();
		System.out.println("Global Variable:"+obj.a);// Global variable is outside the main mehtod and inside the class
		
		System.out.println("Program End");
	}

}
