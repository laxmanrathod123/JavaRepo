   package OverloadingOOPSConcepts;

public class OverRidingExample extends OverRidingExample2 {
	// overloading means replacing the parent same method which where present in
	// the child class means if we print the same method then the content 
	// is  printed for the child class not for parent class 
	public void engine()
	{
		System.out.println("I am in child class engine method");
		System.out.println("parent class is not printed");
	}
	
	public void speed()
	{
		System.out.println("I am in child speed method");
		System.out.println("parent class data is inheritate in child class");
	}
	
	public static void main(String[]args) {
		OverRidingExample obj= new OverRidingExample();
		obj.engine();
		obj.speed();
		
	}
	
	
	
	}


