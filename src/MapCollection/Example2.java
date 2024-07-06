package MapCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example2 {
	
	public static void main(String[]args) {
		//HashMap m= new HashMap();
		HashMap<Integer, String> m= new HashMap<Integer, String> ();
		m.put(101, "john");
		m.put(102, "David");
		m.put(103, "x");
		m.put(104, "Mary");
		m.put(105, "tye");
		
		System.out.println(m);
		System.out.println(m.size());
		boolean flag=m.isEmpty();
		System.out.println("Map is empty :"+flag);
		System.out.println(m.get(105));
		System.out.println(m.remove(104));
		System.out.println(m);
		
		System.out.println(m.containsKey(102)); // it will return true
		System.out.println(m.containsKey(106)); // it will return false
		
		// return all the values as set because set not contain dublicate value
		System.out.println(m.containsValue("tye"));
		// return all the valus as a collection 
		System.out.println(m.containsValue("y")); 
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		
		System.out.println(m.entrySet());
		System.out.println("********************");
		for(Map.Entry entry: m.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		
	}
	
}
