package Array;

public class example {

	public static void main(String args[]) {
		
//		50 3 4
//		5 6 8
//		0 1 3
		 // find out the minimum number from the matrix and find out the maximum number present 
		// in the that column
		
		// find out min number
		// identify the min column
		// find out the max num from that column
		
		int ar[][]= {{50,3,4},{5,6,8},{0,1,3}};
		int minNumber=ar[0][0];
		int minCol;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(ar[i][j]<minNumber) {
					minNumber=ar[i][j];
					minCol=j;
				}
			}
		}
		int k=0;
		int maxNum=ar[0][minNumber];
		while(k<3) {
			if(ar[0][minNumber]>maxNum) {
				maxNum=ar[0][minNumber];
				
			}
			k++;
		}
		System.out.println("minNumber is :" +minNumber);
		System.out.println("Maximum Number in same column :" +maxNum);
	}
}
