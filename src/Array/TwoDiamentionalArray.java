package Array;


public class TwoDiamentionalArray {

	public static void main(String[] args) {
		int ar[][]= new int [3][2];
		ar[0][0]=10;
		ar[0][1]=20;
		
		ar[1][0]=30;
		ar[1][1]=40;
		
		ar[2][0]=50;
		ar[2][1]=60;
		
		System.out.println("Printing the array: "+ar[0][1]);
		// Length of the row
		System.out.println("length of the row: "+ar.length);
		
		// Length of the column
		System.out.println("length of the column: "+ar[0].length);
		
		//for(int i=0 ; i<ar.length; i++)
		for(int i=0 ; i<=2; i++)  // This for loop for incrementing the rows
		{
			for(int j=0; j<=1; j++)// This for loop for incrementing the column for each row 
			{
				//System.out.println(ar[i][j]+" ");
				System.out.print(ar[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("**********************");
		//enhanced loop for printing the array
		for (int i[]:ar)
		{
			for (int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("********************");
		//for object type of array
		
		Object obr[][]= new Object [3][2];
		obr[0][0]=10;
		obr[0][1]=20.23;
		
		obr[1][0]="OneTwo";
		obr[1][1]="Numbers";
		
		obr[2][0]='C';
		obr[2][1]=true;
		
		for (Object []i :obr)
		{
			for (Object j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
