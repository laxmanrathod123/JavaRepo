package MainMethodOverLoading;

public class addParameterToMainMethod {
	
	public static void main(String [] a) {
		
		for(String s: a) {
			System.out.println(s);
		}
		
		int l =a.length;
		System.out.println("lenght of the string array: " + l);
		
	}

}
