package Streams;

import java.util.ArrayList;

public class Test1 {
	
	public static void main(String[]args) {
		
		ArrayList<String>names= new ArrayList<String>();
		names.add("Abhijit");
		names.add("Don");
		names.add("Alekhya");
		names.add("Addam");
		names.add("Ram");
		int count=0;
		for(int i=0 ; i<names.size(); i++) 
		{
			String actual=names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
