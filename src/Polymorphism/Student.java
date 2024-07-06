package Polymorphism;

public class Student {

	String name;
	int age;
	// This is called compile time polymorphism i.e we have same function
	// name but different purpose
	Student(){
		
	}
	public void printInfo(String name) {
		System.out.println(name);
	}
	
	public void printInfo(int age) {
		System.out.println(age);
	}
	
	public void printInfo(String name , int age) {
		System.out.println(name + "  " + age);
	}
	public static void main(String args[]) {
		Student s1 = new Student();
		s1.name="Laxman";
		s1.age=28;
		System.out.println(s1.age);
		System.out.println(s1.name);
		System.out.println( );
		s1.printInfo(s1.age);
		s1.printInfo(s1.name);
		s1.printInfo(s1.name, s1.age);
		
		
	}
	}
