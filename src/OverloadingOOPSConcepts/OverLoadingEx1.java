package OverloadingOOPSConcepts;

public class OverLoadingEx1 {
	
	public void getData(int a)
	{
		System.out.println(a);
	}

	public void getData(int a, int b)
	{
		System.out.println(a+" "+b);
		
	}

	public void getData(String a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		OverLoadingEx1 obj= new OverLoadingEx1();
		obj.getData(10);
		obj.getData(50, 100);
		obj.getData("Lucky");
	}

}
