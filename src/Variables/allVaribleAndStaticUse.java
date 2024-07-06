package Variables;

public class allVaribleAndStaticUse {
	
	// These are called instance variable which is present in the class 
	// i.e the variable which is present inside the class which is instance variable
	String name;
	String address;
	String city;
	static String profile="QA";
	static String Name;
	static int num1;
	static {
		 Name="Laxman";
		 num1=1;
	}
	//constructor -> its called automatically when you create the object of the class
	// The variable which is present in constructor are the local variable
	allVaribleAndStaticUse(String Name, String Address, String City){
		this.name=Name;
		this.address=Address;
		this.city=City;
		
	}
	public String getAddress() {
		return address;
	}
	public String getcity() {
		return city;
	}
	
	public void getname() {
		System.out.println(name +  " & " + profile );
		//return name + " & " + profile; //this is the one way to do
	}
	
	public static void main(String[] args) {
		allVaribleAndStaticUse obj= new allVaribleAndStaticUse("bob","maithali","Banglore");
		allVaribleAndStaticUse obj1= new allVaribleAndStaticUse("Laxman","Lihedigar","Jalgaon");
	//	System.out.println(obj.getname());
		obj.getname();
		System.out.println(obj.getAddress());
		System.out.println(obj.getcity());
		System.out.println();
		//System.out.println(obj1.getname());
		obj1.getname();
		System.out.println(obj1.getAddress());
		System.out.println(obj1.getcity());
		//obj.getAddress();
		System.out.println(allVaribleAndStaticUse.Name);
		System.out.println(allVaribleAndStaticUse.num1);
		String n=allVaribleAndStaticUse.Name;
		int n1=allVaribleAndStaticUse.num1;
		System.out.println(n);
		System.out.println(n1);
	}

}
