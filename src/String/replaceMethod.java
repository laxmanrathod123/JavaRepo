package String;

public class replaceMethod {
	// To Remove the white spaces present int the given string
	
	public static void main (String[]args) {
		String str= "JavaTraining";
		
		System.out.println(str.replace("a", "h"));
		System.out.println(str.replaceAll("JavaTraining", "java"));
		System.out.println(str.replaceFirst("Ja", "Ha"));
		System.out.println(str.replace("J", "Y"));
		
		
		
		
	}

}
