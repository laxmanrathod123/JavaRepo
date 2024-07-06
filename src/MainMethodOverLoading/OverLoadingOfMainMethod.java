package MainMethodOverLoading;

public class OverLoadingOfMainMethod {
	int number=10;
	
	void main(String a){
		System.out.println(a);
	}
	
	void main(String a, int b) {
		
	}

	void main() {
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		OverLoadingOfMainMethod ov= new OverLoadingOfMainMethod();
		ov.main();
		ov.main("Laxman");
		ov.main("Rathod",100);
	}
}
