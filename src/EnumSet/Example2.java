package EnumSet;

import java.util.EnumMap;

public class Example2 {

	public enum Days{Sundday, Monday, Tuesday,Wensday, Thursday, friday , Saturday}
	
	public static void main(String[] args) {

			// create a enum map 
		EnumMap <Days,String>enmap= new EnumMap<Days,String>(Days.class);
		enmap.put(Days.Monday, "Day 2");
		enmap.put(Days.Sundday, "Day 1");
		enmap.put(Days.friday, "Day 4");
		enmap.put(Days.Saturday, "Day 3");
		enmap.put(Days.Thursday, "Day 5");
		enmap.put(Days.Tuesday, "Day 6");
		enmap.put(Days.Wensday, "Day 7");
		
		System.out.println(enmap.entrySet());
		System.out.println(enmap.keySet());
		System.out.println(enmap.values());
		
		boolean flag=enmap.containsKey(Days.Monday);
		System.out.println("Is that day present in the enum set: "+flag);
		
	   boolean  flag2= enmap.containsValue("Day 6");	
	   System.out.println("Is that day present in the enum set: "+flag2);
	   
	   
	Object getday=   enmap.get(Days.Monday);
	System.out.println("value of monday: "+getday);
	   
	   
		
		
		
		
	}

}
