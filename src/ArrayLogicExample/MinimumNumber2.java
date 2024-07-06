package ArrayLogicExample;

public class MinimumNumber2 {

	public static void main(String[]args) {
		
	
		int abc[][]= {{2,4,5},{0,4,7},{1,2,9}};
		
		int min=abc[0][0];    // This is for Minimum Number
	
		int minimumcolumn=0;
		
		for(int i=0;i<3; i++) 
		{
			
			for(int j=0; j<3; j++) 
			{
				if(abc[i][j]>min) 
			  	
				{
					min=abc[i][j];
					minimumcolumn=j;
					
					
				}
			}
			
		}
		int maximum=abc[0][minimumcolumn];
		int k=0;
		while(k<3) {
			if(abc[k][minimumcolumn]>maximum)
			{
				maximum=abc[k][minimumcolumn];	
			}
			k++;
		}
		
		System.out.println("Maximum value in the identified minimum value column: "+maximum);
	}
}
