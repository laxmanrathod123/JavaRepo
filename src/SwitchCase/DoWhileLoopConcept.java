package SwitchCase;

import java.util.Scanner;

public class DoWhileLoopConcept {
	
	public static void main (String []args) {
		
		String yn;
		do {
				Scanner scn= new Scanner(System.in);
				System.out.println("Enter the first number");
				int firstNumber=scn.nextInt();
				
				System.out.println("Enter the second number");
				int secondNumber= scn.nextInt();
				
				System.out.println("Enter the Arithematic Symbol(+,-,*,/)");
				String sys=scn.next();
				
				int res;
				
				switch(sys)
				{
						case "+": res= firstNumber + secondNumber;
						          System.out.println("Addition of the number: "+res);
						          break;
						          
						case "-": res= firstNumber - secondNumber;
				                  System.out.println("Subtraction of the number: "+res);  
				                  break;
				                  
						case "*": res= firstNumber * secondNumber;
			                      System.out.println("Multiplication of the number: "+res);  
			                      break;
			                      
						case "/": res= firstNumber / secondNumber;
			                      System.out.println("Division of the number: "+res); 
			                      break;
			                      
			            default : System.out.println("User Enter Invalid Symbol");
			                      break;
				}
				System.out.println("Do you want to continue (press y for Yes and n for No)");
				yn=scn.next();
				
				
		}while(yn.equals("y")||yn.equals("Y"));
	    }

}
