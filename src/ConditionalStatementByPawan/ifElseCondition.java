package ConditionalStatementByPawan;

public class ifElseCondition {
	
	public static void main(String[]argas) {
		// if we have more than one condition then we can use 
		// if else if else if 
		// lets say we have below input condition 
		//1. if given number is >0 then its positive number
		//2. if given number is <0 then its negative number
		//3. if given number is equal zero then its zero number
		
		int number=0;
		if(number>0) { // more than one condition
			System.out.println("Given number is positive number");
		}else if (number<0) {
			System.out.println("Given number is negative number");
		}else if(number==0) {
			System.out.println("Given number is zero number");
		}
	}

}
