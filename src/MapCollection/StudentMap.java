   package MapCollection;

import java.util.HashMap;
import java.util.Map.Entry;

public class StudentMap {

	public static void main(String[] args) {

		HashMap <Integer, Student>hm= new HashMap <Integer,Student>();
		
		Student st1= new Student("Rahul",10,90);
		Student st2= new Student("Mukesh",9,80);
		Student st3= new Student("Pritesh",8,70);
	   int size=	hm.size();
	  
		hm.put(1, st1);
		hm.put(2, st2);
		hm.put(3, st3);
		 System.out.println("size of the map :" + size);
		for(Entry <Integer,Student>m:hm.entrySet()) {
			
		int key=	m.getKey();
		Student s=m.getValue();
		System.out.println("Student " + key + " record");
		System.out.println(s.studentname + " " + s.Class + " " + s.marks + " ");
			
		}
	}

}
