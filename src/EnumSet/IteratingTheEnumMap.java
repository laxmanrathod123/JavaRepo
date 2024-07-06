package EnumSet;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class IteratingTheEnumMap {
	
	public enum CartoonCharacter{
		
      Archie, Sabrina, Tom, Jerry, Mickey, Richie;	
	}

	public static void main(String[] args) {
		
		EnumMap<CartoonCharacter,String>enmap= new EnumMap<CartoonCharacter,String>
		(CartoonCharacter.class);
		
		enmap.put(CartoonCharacter.Archie, "Main Hero");
		enmap.put(CartoonCharacter.Sabrina, "Teenager");
		enmap.put(CartoonCharacter.Tom, "Mouse");
		enmap.put(CartoonCharacter.Jerry, "Cat");
		enmap.put(CartoonCharacter.Mickey, "Richest kid");
		enmap.put(CartoonCharacter.Richie, "Mouse");
		
		System.out.println(enmap);
		int sizeOfEnumMap=enmap.size();
		System.out.println("size of the enum Map :"+sizeOfEnumMap);
		
		System.out.println("After clearing the enum map");
		enmap.clear();
		System.out.println(enmap);
		
		boolean remove=enmap.remove(CartoonCharacter.Archie,"Main Hero");
		System.out.println("Is that key and value is remove :"+remove);
		
		System.out.println("Iterating the keys of the enum map");
       Iterator<CartoonCharacter>keyset= enmap.keySet().iterator();	
       while(keyset.hasNext()) {
    	  Object key= keyset.next();
    	  System.out.println(key);
       }
		System.out.println("\n");
		
      System.out.println("Iterating the values of the enum map");
       Iterator <String>values=enmap.values().iterator();
       while(values.hasNext()) {
    	   String str=values.next();
    	   System.out.println(str);
       }
       System.out.println("\n");
       
       System.out.println("Iterating the entry in the enummap");
       Iterator<Entry<CartoonCharacter, String>>entry=enmap.entrySet().iterator();
       
       while(entry.hasNext()) {
    	   Entry<CartoonCharacter,String>str=entry.next();
    	  //Object en= entry.next();
    	 // System.out.println(en);
    	  System.out.println(str);
       }
       

	}

}
