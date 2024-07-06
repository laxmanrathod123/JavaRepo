package Constructor;

public class Student {
	// Parameterize Constructor
	String name;
	int age;
	
	Student(String Name, int Age){
		this.name=Name;
		this.age=Age;
	}

	public void printStudentInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	public static void main(String args[]) {
		Student s1= new Student("Laxman",28);
		s1.printStudentInfo();
	}
}
