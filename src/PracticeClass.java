public class PracticeClass {
	
	public static void main (String []args) {
// reverser the each word of the string
       String str= " I like program Languages Java";
       String ar[]=str.split(" ");
     
       String rev="";
       for(int i=ar.length-1; i>=0; i--)
       {
    	  
    	   rev= rev+ ar[i] + " ";
       }
       System.out.println(rev);
	}
	
	
		
	}



