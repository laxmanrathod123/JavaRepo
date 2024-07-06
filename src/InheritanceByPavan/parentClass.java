package InheritanceByPavan;


	
	class A {
		int a;
		int display(int a ) {
			//System.out.println(a);
			return a; 
		}
		
	}
	
	class B extends A  {
		int b;
		String show(String b) {
			//System.out.println(b);
			return b;
		}
	}
	
	class C extends B{
		int c;
		char print(char c) {
			//System.out.println(c);
			return c;
		}
		
	}

	public class parentClass {
		
	public static void main (String[]args) {
		char c='L';
		String str="Laxman";
		int nubmer=100;
		C obj = new C();
		obj.a=10;
		obj.b=20;
		obj.c=100;
		System.out.println(obj.display(nubmer));
		System.out.println(obj.show(str));
		System.out.println(obj.print(c));
		
		 
	}
}
