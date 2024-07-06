package MapCollection;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		HashMap<Integer,String>hm= new HashMap<Integer,String>();
		hm.put(1, "java");
		hm.put(2, "selenium");
		hm.put(3, "OOPs");
		hm.put(4, "Automation");
		
		System.out.println(hm);

		System.out.println(hm.get(1));
		System.out.println(hm.get(5)); // it will not give you exception it will give you null
		
		for(Entry e: hm.entrySet()) {
			System.out.println(e.getKey() + " " +e.getValue());

		}
		HashMap <Integer, Employee>emp= new HashMap<Integer, Employee>();
		Employee e1=new Employee("steve",25,"admin");
		Employee e2=new Employee("mathy",26,"qa");
		Employee e3=new Employee("mathy",27,"dev");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry <Integer, Employee> m : emp.entrySet()) {
			
			int key=m.getKey();
			Employee em=m.getValue();
			
			System.out.println("Employee"+ key +" info ");
			System.out.println(em.name + " "+em.age +" "+em.dept +" ");
		}
	}

}
