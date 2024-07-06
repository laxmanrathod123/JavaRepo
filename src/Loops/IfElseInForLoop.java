package Loops;

public class IfElseInForLoop {
	
	public static void main (String[]args) {
		//if(true) its means if condition is true then it will go inside the curly braces and execute
		for(int i=0; i<10; i=i+2) {
			if(i==8)
				System.out.println("8 is displayed");
			else
				System.out.println("I did not find ");
		}
		
		System.out.println();
		
		for(int j=0 ; j<10; j=j+2) {
			if(j==9)
				System.out.println(" 8 is displayed");
			else
				System.out.println("I did not find the number");
		}
	}

}
