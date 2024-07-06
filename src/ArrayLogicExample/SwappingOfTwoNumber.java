package ArrayLogicExample;

public class SwappingOfTwoNumber {

	public static void main(String[] args) {
// 1. Swamping The variable with using temp variable
		int a=4;
		int b=5;
		int temp;
		System.out.println("Before swapping the value of a and b ");
		System.out.println("Before swapping the value of a :"+a);
		System.out.println("Before swapping the value of b :"+b);
		System.out.println();
	
		System.out.println("After swapping the value of a and b ");
		System.out.println("After swapping the value of a :"+a);
		System.out.println("After swapping the value of b :"+b);
		temp=a;
		a=b;
		b=temp;
		
		
		// 2. Swamping The variable without using temp variable
		
		int x=5;
		int y=4;
		
		System.out.println("Before swapping the value of x and y ");
		System.out.println("Before swapping the value of x :"+x);
		System.out.println("Before swapping the value of y :"+y);
		System.out.println();
		
		
		x=x+y;    // x=5+4=9
		y=x-y;    // y=9-4=5
		x=x-y;    // x=9-5=4
		
		System.out.println("After swapping the value of x and y ");
		System.out.println("After swapping the value of x :"+x);
		System.out.println("After swapping the value of y :"+y);
	
	}
	
	


}
