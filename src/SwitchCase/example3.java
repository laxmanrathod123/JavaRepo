package SwitchCase;

import java.util.Scanner;

public class example3 {
	
	public static void main (String []args) {

		String sn;
		do
			{
			    Scanner scn= new Scanner(System.in);
			    System.out.println("Enter the button");
			    int button= scn.nextInt();
			    
			    switch(button)
					    {
					    case 1: System.out.println("Good Morning");
					            break;
					            
					    case 2: System.out.println("Good Afternoon");
			                    break; 
			                    
					    case 3: System.out.println("Good Evening");
		                        break; 
		                        
					    case 4: System.out.println("Good Night");
		                        break;    
		                        
		              default : System.out.println("Invalid button number enter");
		                        break;
					    }
					    System.out.println("Do you want to continue (Press y for Yes and n for No) ");
					    sn=scn.next();
		     }while(sn.equals("y")||sn.equals("Y"));
	}

}
