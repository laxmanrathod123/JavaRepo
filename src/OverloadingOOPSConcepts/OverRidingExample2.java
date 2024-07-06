package OverloadingOOPSConcepts;

public class OverRidingExample2 {
	
	public void engine()
	{
		System.out.println("parent class engine method");
	}
	
	public void speed()
	{
		System.out.println("parent class speed method");
	}
	
	public static void main(String[] args) {
		OverRidingExample2 obj= new OverRidingExample2();
		obj.engine();
		obj.speed();
		
	}
	
	}


