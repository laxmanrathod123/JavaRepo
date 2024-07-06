package Java8Feature;

import java.util.stream.IntStream;

public class Iterative_vs_DeclarativeExample {

	public static void main(String[] args) {

		int sum=0;
		for(int i=0 ; i<=100; i++) {
			sum+=i;
		} 
		System.out.println("sum using iterative approach :"+ sum );
		
		int sum1= IntStream.rangeClosed(0, 100)
				.parallel()
				.sum();

		System.out.println(" Sum using Declarative method :"+ sum1);
	}
	
	
}

