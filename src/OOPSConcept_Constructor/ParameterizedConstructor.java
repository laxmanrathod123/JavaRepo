package OOPSConcept_Constructor;

public class ParameterizedConstructor {
	
	public ParameterizedConstructor()
	{
		System.out.println("I am in Constructor of the class");
		System.out.println("constructor is created whenever we create object");
	}
	
	public ParameterizedConstructor(int a, int b)
	{
		int c=a+b;
		System.out.println(a+" "+b);
		System.out.println(c);
		
	}
	
	public ParameterizedConstructor(String str)
	{
		System.out.println(str);
	}
	public static void main(String[]args) 
	{
		ParameterizedConstructor obj= new ParameterizedConstructor("Hellow");
		ParameterizedConstructor obj1= new ParameterizedConstructor(4,5);
		
	}

}
 