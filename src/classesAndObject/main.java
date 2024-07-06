package classesAndObject;

public class main extends childClass {

// how can we call the method from other class and create the object of class
	public static void main(String[] args) {

		System.out.println("Navigated to HOME page");
		// childClass c= new childClass();
		main c = new main(); // here I have used the inheritance concept
		System.out.println(c.chid());
		// we can do like below by storing into some variable and print
		// String status=c.chid()
		// System.out.println(status);

		System.out.println("************");

		// login page method calling

		System.out.println(c.loginPage());

	}
}
