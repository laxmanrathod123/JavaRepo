package Array;

public class TwoDArray {

	public static void main(String[] args) {
                             // This stand for 1 row
		int ar[][]= {{1,2},{3,4}};
		           // This stand for 0 th row
		
		for(int i=0; i<2; i++) 
		{
			for (int j=0; j<2; j++)
			{
			// 1st way of printing the array
			System.out.println("ar["+ i + "][" +j +"]="+ar[i][j]);
			
			// 2nd way of printing the array
			//System.out.println(ar[i][j]+ " ");
			
			}
			//System.out.println();
		}
		
	
		             
	}

}
