package Array;

public class PracticeEx {
	
	public static void main(String args[]) {

		//int ar[]= {1,2,3,4};
		int a[][]= {{2,5,6},{3,5,5},{1,2,3}};
//		2 5 6 
//		3 5 5
//      1 2 3 
// find out the minimum number from the matrix
		
		int min=a[0][0];

			for (int i=0; i<3; i++)
			{
				for(int j=0; j<3; j++)
				{
//					if(a[i][j]>min)
//						min=a[i][j];
					System.out.println("a["+i+"]["+j+"]="+ a[i][j]);
				}
			}
			//System.out.println("Maximum number is :" + min);
		}
		
	}


