package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeClass {

	public static void main(String[] args) {
		int ar[][]= new int [3][2];
		ar[0][0]=10;
		ar[0][1]=20;
		
		ar[1][0]=30;
		ar[1][1]=40;
		
		ar[2][0]=50;
		ar[2][1]=60;
		
		for(int i=0; i<3; i++)
		{
			for (int j=0; j<2; j++) 
			{
				System.out.print(ar[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("printing using enhanced for loop");
		 
		for(int i[]:ar) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
