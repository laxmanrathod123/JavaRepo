package SwitchCase;

import java.util.Scanner;

public class ExampleTwo {

	public static void main (String []args) {

		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstno= scn.nextInt();

		System.out.println("Enter the second number");
		int secondno= scn.nextInt();

		System.out.println("Enter symbol(+,-,*,/)");
		String sys= scn.next();
		int res;
		switch(sys)
		{
		case "+": res=firstno+secondno;
		System.out.println("Addition is :"+res);
		//break;
		case "-": res=firstno-secondno;
		System.out.println("subtraction is :"+res);
		//break;
		case "*": res=firstno*secondno;
		System.out.println("multiplication is :"+res);           
		//break;   
		case "/": res=firstno/secondno;
		System.out.println("division is :"+res);
		//break;
		default : System.out.println("Invalid symbol");
		break;

		}

	}

}