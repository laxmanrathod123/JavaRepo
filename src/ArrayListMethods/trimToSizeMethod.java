package ArrayListMethods;

import java.util.ArrayList;

public class trimToSizeMethod {

	public static void main(String[] args) {
	ArrayList <Integer> number= new ArrayList<Integer>(9);
	number.add(10);
	number.add(20);
	number.add(100);
	number.add(60);
	number.add(80);
	
	for(Integer i: number) {
		System.out.println(+i);
	}
    number.trimToSize();
    System.out.println("***************************");
    number.stream().forEach(ele -> System.out.println(ele));

	}

}
