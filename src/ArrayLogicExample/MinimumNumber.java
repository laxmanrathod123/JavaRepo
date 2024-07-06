package ArrayLogicExample;

public class MinimumNumber {

	public static void main(String[]args) {
		
		// How to print the minimum value from the matrix
		// How to print the maximum value from the matrix
		int abc[][]= {{12,4,5},{3,4,7},{1,2,9}};
		
		//int min=abc[0][0];    // This is for Minimum Number
		int max=abc[0][0];    // This is for Maximum Number
		
		for(int i=0;i<3; i++) 
		{
			
			for(int j=0; j<3; j++) 
			{
				//if(abc[i][j]>min) 
			   if(abc[i][j]>max) 	
				{
					//min=abc[i][j];
					max=abc[i][j];
					
				}
			}
			
		}
		//System.out.println("Minimum value in the matrix: "+min);
		System.out.println("Minimum value in the matrix: "+max);
	}
}
