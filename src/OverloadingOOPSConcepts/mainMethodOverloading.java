package OverloadingOOPSConcepts;

public class mainMethodOverloading {

	public static void main(String[] args) {
		System.out.println(" I am in main method");

		main(new int[] {1,2,3});
	}

	public static void main(int[] args) {
		System.out.println(" I am in integer method");
	}
}
