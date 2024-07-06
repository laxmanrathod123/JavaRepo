package StringBuffer;

public class example {

	public static void main(String[] args) {

		// why the string is immutable in java
		// cause we can not alter the string so its immutalbe and to do this 
		//mutable we have stringbuffer and stringbuilder class
		
		String str="hello";
		String str1="hello";  //at this the str1 is poiting the same content in str
		System.out.println(str1.concat(" world" ));
		
		System.out.println();
		
		//StringBuffer sb= new StringBuffer("Hellow");  //same method use in both classes
		StringBuilder sb= new StringBuilder("Hellow");
		sb.append(" world");
		System.out.println(sb);
		
		System.out.println();
		
		sb.insert(2, "aa");
		System.out.println(sb);
		
		sb.replace(1, 4, "yy");
		System.out.println(sb);
		
	}

}
