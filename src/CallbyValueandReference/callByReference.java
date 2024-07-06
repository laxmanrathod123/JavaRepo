package CallbyValueandReference;

public class callByReference {
	
	public static void main(String args[]) {
		test t = new test();

		t.number=100;
		System.out.println("value before method:" + t.number);
		
		t.demo2(t);
		System.out.println("value after method:" + t.number);
	}
   
	
	

}
