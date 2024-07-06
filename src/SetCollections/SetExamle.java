package SetCollections;

import java.util.HashSet;

public class SetExamle {

	public static void main(String[] args) {

		HashSet <String> hs= new HashSet<String>();
		   hs.add("Orange"); 
		   hs.add("Red"); 
		   hs.add("Blue"); 
		   hs.add("Yellow"); 
		   hs.add("Green"); 
		   
		   if(hs.equals("black"))
		   {
			   System.out.println("black is present in the set");
		   }else
		   {
			   hs.add("black");
			   System.out.println("Successfully blakc is added in the set");
		   }
		   
		   hs.stream().forEach(ele-> System.out.println(ele));
		   
		   int hashcode = hs.hashCode(); 
		   System.out.println("HashCode value: " +hashcode); 
	}

}
