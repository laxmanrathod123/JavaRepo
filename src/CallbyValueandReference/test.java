package CallbyValueandReference;

public class test {
	
	int number;
	
	void demo (int number) {
		number=number+10;
		System.out.println("value in the method : " + number);
	}
 
	void demo2(test t) {
		t.number=t.number+10;
		System.out.println("value in the method : " + t.number);
	}
}
