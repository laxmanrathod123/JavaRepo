package InheritanceOOPConcepts;

public class B extends A {
	int a=20;
	
	public static void main(String[]args) {
		//B b= new B();       // It will return the value 20
		A b= new B();         // It will return the value of class A variable 10
		System.out.println(b.a);
	}

}
