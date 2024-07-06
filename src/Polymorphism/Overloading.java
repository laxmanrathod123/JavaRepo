package Polymorphism;

public class Overloading {
	
	public static void main(String [] args) {
		Test t = new Test();
		System.out.println(t.test(1000,10));
		t.test(1000,10);
		t.test(10.10, 10);
		t.test(true);
		
	}

}
