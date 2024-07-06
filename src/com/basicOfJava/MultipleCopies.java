package com.basicOfJava;

public class MultipleCopies {
	
	int a= 10;
	short s=100;
	
	public static void main(String []args)
	{
	System.out.println("*** for object one");
	MultipleCopies obj1= new MultipleCopies();
	System.out.println("obj1="+obj1.a);
	System.out.println("obj1="+obj1.s);
	System.out.println("=================");
	
	System.out.println("After Updating the value of object");
	obj1.a=1000;
	obj1.s=2000;
	System.out.println("obj1="+obj1.a);
	System.out.println("obj1="+obj1.s);
;
	System.out.println("*** for object Two");
	MultipleCopies obj2= new MultipleCopies();
	System.out.println("obj2="+obj1.a);
	System.out.println("obj2="+obj1.s);
	}

}
