package com.basicOfJava;

public class Parameterization {
	
	public int addition(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	public static void main(String[]args) {
		Parameterization obj=new Parameterization();
		int sum1=obj.addition(10, 20);	
		System.out.println("sum1:"+sum1);
		
	}

}
