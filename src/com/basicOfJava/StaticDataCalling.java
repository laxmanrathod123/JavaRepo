package com.basicOfJava;

public class StaticDataCalling {
	int cc=10;
	static int aa=100;
	static int bb=200;
	 static StaticDataCalling object = new StaticDataCalling();
	 // it means we have to make the object as static
	public static void main(String []args)
	{
		System.out.println("Calling static data by using object");
		StaticDataCalling obj=new StaticDataCalling();
		System.out.println("aa="+obj.aa);
		System.out.println("bb="+obj.bb);
		System.out.println();
		
		System.out.println("After updating the value of Static data");
		obj.aa=5000;
		obj.bb=9000;
		System.out.println("aa="+obj.aa);
		System.out.println("bb="+obj.bb);
		System.out.println();
		
		System.out.println("Calling static data by using class name");
		System.out.println("aa="+StaticDataCalling.aa);
		System.out.println("bb="+StaticDataCalling.bb);
		System.out.println();
		
		System.out.println("Calling static data by using name");
		System.out.println("aa="+aa);
		System.out.println("bb="+bb);
		System.out.println();
		
		System.out.println("for global nonstatic variable calling");
		System.out.println( "global cc:"+StaticDataCalling.object.cc);
	}

}
