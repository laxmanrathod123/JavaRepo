package HashTable;

import java.util.Hashtable;

public class HashTableEx1 {
	
	public static void main(String[] args) {
		
		Hashtable <String, Integer> marks= new Hashtable<String,Integer>();
		marks.put("Naveen", 100);
		marks.put("tom", 200);
		marks.put("lisa", 300);
		marks.put("peter", 400);
		marks.put("Robby", 500);
		marks.put(null, 600);
		marks.put("laxman", null);
		//marks.get(null);
		marks.get("laxman");
		
	}

}
