package Loops;

public class ElseIf {

	public static void main(String []args) {
		
		int a=2;
		int b=5;
		
		if(a==b) {
			System.out.println("Its equal");
		}else {
			if(a>b) {
				System.out.println("a is greater");
			}else {
				System.out.println("a is lesser");
			}
		}
		System.out.println("\n");
		
		
		
		int x=5;
		int y=3;
		
		if(x==y) {
			System.out.println("x is equal");
		}else if(x>y) {
			System.out.println("x is greater than y");
		}else {
			System.out.println("x is smaller than y");
		}
				
	}
}
