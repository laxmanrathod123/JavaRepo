package Array;

public class ThreeDiamentionalArray {
	
       public static void main(String[]args) {
    	   int ar[][][]= new int [2][3][4];
    	   ar[0][0][0]=1;
    	   ar[0][0][1]=2;
    	   ar[0][0][2]=3;
    	   ar[0][0][3]=4;
    	   
    	   ar[0][1][0]=5;
    	   ar[0][1][1]=6;
    	   ar[0][1][2]=7;
    	   ar[0][1][3]=8;
    	   
    	   ar[0][2][0]=9;
    	   ar[0][2][1]=10;
    	   ar[0][2][2]=11;
    	   ar[0][2][3]=12;
    	   
    	   ar[1][0][0]=13;
    	   ar[1][0][1]=14;
    	   ar[1][0][2]=15;
    	   ar[1][0][3]=16;
    	   
    	   ar[1][1][0]=17;
    	   ar[1][1][1]=18;
    	   ar[1][1][2]=19;
    	   ar[1][1][3]=20;
    	   
    	   ar[1][2][0]=21;
    	   ar[1][2][1]=22;
    	   ar[1][2][2]=23;
    	   ar[1][2][3]=24;
    	  
    	   System.out.println(" array: "+ar[1][2][0]);
    	   System.out.println("length of the array: "+ar.length);
    	   System.out.println("length of the array: "+ar[0].length);
    	   System.out.println("length of the array: "+ar[0][0].length);
    	 
	
}
}
