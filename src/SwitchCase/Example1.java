package SwitchCase;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		//Scanner scn = new Scanner (System.in);
		//int number= scn.nextInt();
		int number=1;
		switch(number) {
		case 1 : System.out.println("Hello");
		break;
		case 2: System.out.println("Namaste");
		break;
		case 3: System.out.println("Bonjure");
		break;
		default : System.out.println("Invalid number");
		}
	}

}
