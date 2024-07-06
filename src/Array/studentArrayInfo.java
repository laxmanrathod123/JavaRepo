package Array;

public class studentArrayInfo {

	public static void main(String[] args) {

		Student arr[];
		
		arr=new Student [5];
		
		arr[0]= new Student(1,"Aman",8);
		
		arr[1]=new Student(2,"Raju",9);
		
		arr[2]=new Student(3,"Neha",10);
		
		arr[3]=new Student(4,"Pankaj",5);
		
		arr[4]=new Student(5,"Tripathi",7);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Element at " + i + " : "
		                +  arr[i].roll_no + " "
                        + arr[i].name + " " 
		                + arr[i].classname);
			
			
		}
		
		// printing the array by using enhanced for loop
		System.out.println("******************");
		
		for(Student std:arr) {
			System.out.println(std);
		}
		
		
	}

}
