package InheritanceOOPConcepts;

public class MutipleInhertanceNotSupported{

	class A
	{
		void testdata() {
			System.out.println("I am in class a");
		}
	
	}
	
	class B
	{
		void testdata() {
			System.out.println("I am in class b");
		}
	
	}
	class C extends B{
		void testdata() {
			System.out.println("I am in class c");
		}
	
	}
	public static void main(String[] args) {
		
	}
}
