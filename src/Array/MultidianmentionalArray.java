package Array;

public class MultidianmentionalArray {
	
	public static void main (String []args) {
		int ar[][]= new int[2][3];
		ar[0][0]=2;
		ar[0][1]=4;
		ar[0][2]=5;
		
		ar[1][0]=3;
		ar[1][1]=4;
		ar[1][2]=7;
		
		// printing the array 
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.println(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

}
