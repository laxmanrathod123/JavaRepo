package Variables;

public class practice {
	String name="";
	String sirname="";
	static String jobProfile="QA";
	static int i=0;
	
	practice(String Name, String SirName){
		this.name=Name;
		this.sirname=SirName;
		i++;
		System.out.println(i);
		
	} 
	
	void printProfileInfo() {
		System.out.println(name + " " + sirname + " " + jobProfile);
	}
	
	public static void main(String[]args) {
		practice p= new practice("Laxman","Rathod");
		practice p1=new practice("Priyanka","Rathod");
		p.printProfileInfo();
		p1.printProfileInfo();
	}

}
