package Variables;

public class InstantVariable {
	String name="";    // These are the instant variable
	String address="";
	static String city="Banglore";
	static int i=0;
	InstantVariable(String Name,String Adress,String City)
	{
		this.name=Name;
		this.address=Adress;
		i++;
		System.out.println(i);
	}
	public void getAdress()
	{
		System.out.println(address+" "+city);
	}

	public static void main(String[] args) {
		InstantVariable obj= new InstantVariable("Bob","Marthalli","Banglore");
		obj.getAdress();
		InstantVariable obj1= new InstantVariable("Bob","pune","Banglore");
		obj1.getAdress();
	}

}
