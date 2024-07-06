package SuperKeyword;

public class childClass extends ParentClass {
	
	String name="QA_Automation";
	
	public childClass()
	{
		//super();
		System.out.println("I am in the child class constructor");
	}
     public void getData()
     {
    	 System.out.println(name);
    	 System.out.println(super.name);
     }
     
     public void getStringData()
     {
    	 super.getStringData();
    	 System.out.println("I am in child class");
     }
	
	public static void main(String[]args) {
		childClass obj= new childClass();
		obj.getData();
		obj.getStringData();
	}

}
