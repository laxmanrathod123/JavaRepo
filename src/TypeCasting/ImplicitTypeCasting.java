  package TypeCasting;

public class ImplicitTypeCasting {
	
	public static void main(String[]args) {
		
		byte a=10;    
		short b= a;      // Implicit Type Casting
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("*************************");
		
		short x=20;
		byte y=(byte)x;     //explicit type casting
		System.out.println(x);
		System.out.println(y);
	}

}
