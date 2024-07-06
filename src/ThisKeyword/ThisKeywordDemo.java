package ThisKeyword;

public class ThisKeywordDemo {
	
	int a=10;
	
	public ThisKeywordDemo()
	{
		
		System.out.println("I am in this constructor");
	}
	
	public void getData()
	{
		int a=50;
		int sum=a+this.a;
		System.out.println("sum of gloal and local variable :"+sum);
		System.out.println("Printing the local variable: "+a);
		System.out.println("Using this keyword printing the global variable: "+this.a);
	}
	
	public void String()
	{
		System.out.println("I am in string method");
		this.getData();
		
	}
	
		
	
	public static void main(String[]args)
	{
		ThisKeywordDemo obj= new ThisKeywordDemo();
		obj.getData();
		obj.String();
	}

}
