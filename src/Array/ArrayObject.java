package Array;

public class ArrayObject {
	//in Object we can store multiple data type like string ,int ,and so on
	public static void main(String[]args) {
		 Object obs[]= new Object[5];
		// Object obs[]= {10,10.51f,'A',"String",true};
		 obs[0]=10;
		 obs[1]=10.51f; 
		 obs[2]='A';
		 obs[3]="String"; 
		 obs[4]=true;
		 
		 for(Object s:obs)
		 {
			 System.out.println("Printing the object: "+s);
		 }
	}

	
}
