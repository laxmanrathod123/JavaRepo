package Array;

public class ArrayEx {
	
	public static void main(String []args) {
		int ar[]= new int [5];
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		ar[4]=50;
	
		//Printing the value of array using while loop
		System.out.println("Printing array using while loop");
		int j=0;
		while(j<ar.length) {
			System.out.println(ar[j]);
			j++;
		}
		System.out.println("a[0]= "+ar[0]);
		// finding the total number of row
		System.out.println("Lenght of the Array: " +ar.length);
		
		// print the value of array by using for loop
		
		//for (int i=0; i<5; i++)
			for (int i=0; i<ar.length; i++)  // we can write length also
		{
			System.out.println(ar[i]);
		}
			
		System.out.println("******************");
		
		
		// for each loop
		for (int i:ar) {
			System.out.println(i);
		}
		
		System.out.println("******************");
		String s[]= new String [3];
		s[0]="laxman";
		s[1]="is in ";
		s[2]="pune";
		
		System.out.println("for loop ");
		
		for (int i=0; i<s.length;i++) {
			System.out.println(s[i]);
			
		}
		System.out.println("******************");	
		for (String str:s) {
			System.out.println(str);
		}
		System.out.println("*****************************");
		
		// second way to write the array 
		int sum=0;
		 int ar1[]= {10,20,30,40,50};
		 for (int i:ar1) {
			 System.out.println("values of array:"+i);
			 sum=sum + i;
			// sum =ar[0]+ar[1]+ar[2]+ar[3] +ar[4];
			 System.out.println(sum);
			 //System.out.println();
			// System.out.println("sum of the array: "+sum); 
		 }
		
		
		
	}

}
