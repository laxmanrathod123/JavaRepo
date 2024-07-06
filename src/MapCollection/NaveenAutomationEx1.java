package MapCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class NaveenAutomationEx1 {
	
	public static void main(String[]args) {
		
		HashMap<String,String>capitalMap= new HashMap();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington Dc");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London11");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "LA");
		capitalMap.put("Russia",null );
		capitalMap.put( "france",null);
		
		System.out.println(capitalMap);
		System.out.println();
		
		System.out.println(capitalMap.get("India"));
		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap.get("Russia"));
		System.out.println(capitalMap.get("france"));
		System.out.println(capitalMap.remove("france"));
		
		System.out.println();
		// Iterating the keyset 
		Iterator<String>itr=capitalMap.keySet().iterator();
		while(itr.hasNext()) {
			String keyset=itr.next();
			System.out.println(keyset);
		}
		System.out.println();
		
		// Iterating the valueset
	Iterator<String>it=capitalMap.values().iterator();
	
	while(it.hasNext()) {
		String values=it.next();
		System.out.println(values);
	}
		// iterating the entryset
	
	System.out.println("-----------------------");
	Iterator<Entry<String,String>>ite=capitalMap.entrySet().iterator();
	while(ite.hasNext()) {
		Entry <String,String>entry=ite.next();
		//System.out.println(entry);
		System.out.println("key set: " + entry.getKey() + " value are:" + entry.getValue());
	}
	System.out.println("-----------------------");
	
	capitalMap.forEach((k, v) ->System.out.println(" key ="+ k + " and value =" + v  ));
		
	}

}
