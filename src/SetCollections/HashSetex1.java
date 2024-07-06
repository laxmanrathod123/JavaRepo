package SetCollections;

import java.util.HashSet;

public class HashSetex1 {

	public static void main(String[] args) {

		HashSet<Student> hset = new HashSet<Student>(); 
		
		Student s1= new Student("John", "RSVM", 0012);
		Student s2= new Student("Shubh", "DPS", 1234);
		Student s3= new Student("Ricky", "DAV", 9876);
		
		hset.add(s1);
		hset.add(s2);
		hset.add(s3);
		
	for(Student str:hset)
	{
		System.out.println(str.name + " " + str.sname + " " + str.id);
	}
		
		
	}

}
