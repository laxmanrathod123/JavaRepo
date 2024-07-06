package Constructor;

public class students {
	// copy constructor
	
   String name;
   int age;
   
   
   students(students s2){
	   this.name=s2.name;
	   this.age=s2.age;
   }
   
   students(){
	   
   }
   
   public void printStudentInfo() {
	   System.out.println(this.name);
	   System.out.println(this.age);
   }

   
   public static void main(String args[]) {
	   students s1= new students();
	   s1.name="Laxman";
	   s1.age=28;
	   
	   students s2= new students(s1);
	   s2.printStudentInfo();
	   
   }
}
