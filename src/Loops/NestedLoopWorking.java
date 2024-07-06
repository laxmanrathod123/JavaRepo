package Loops;

public class NestedLoopWorking {
	
	public static void main(String []args) {
		int k=1;
		for(int i=0; i<=4; i++) // This is outer loop 
		{
 		System.out.println("Outer loop started ");	
			for(int j=1; j<=4-i ; j++)// This is inner for loop
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
	}

}

// Print the output in this form 
	/*1 2 3 4
	  5 6 7 
	  8 9
	  10    */