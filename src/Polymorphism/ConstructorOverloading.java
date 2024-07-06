package Polymorphism;

public class ConstructorOverloading {
	
	ConstructorOverloading(){
	  System.out.println("defalult constructor");
	}

	ConstructorOverloading(int a , int b){
		System.out.println(a +b);
		
	}
	
	ConstructorOverloading(String a){
		System.out.println( a);
		
	}
}
