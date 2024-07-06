package CallbyValueandReference;

public class callByValue {
	
	public static void main(String args[]) {
		int number=100;
		
		test t = new test();
		System.out.println("before method: " + number);
		
		t.demo(number);
		System.out.println("after method : " + number);
	}

}
