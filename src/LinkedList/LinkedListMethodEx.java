package LinkedList;

import java.util.LinkedList;

public class LinkedListMethodEx {
	
	public static void main(String[]args) {
		
		LinkedList <String>ll= new LinkedList<String>();
		ll.add("java");
		ll.add("selenium");
		ll.add("rubby");
		ll.add("python");
		
		ll.addFirst("Laxman");
		ll.addLast("Rathod");
		System.out.println("content of the linkedList :"+ll);
		
		System.out.println("--getting the value----");
		System.out.println(	ll.get(0));
		
		System.out.println("--after setting ----");
			ll.set(0, "lucky");
		System.out.println("content of the linkedList :"+ll);
		
		
		System.out.println("--after removing ----");
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of the linkedList :"+ll);
		
		
		System.out.println("--after get mehtod ----");
		System.out.println(ll.getFirst());
		
		ll.getLast();
		System.out.println(ll.getLast());
		
		// How to print the value of LinkedList
		System.out.println("** printing using while loop*** ");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++; 
		}
		
		System.out.println("** printing using lambda expresion loop****** ");
		
		ll.stream().forEach(ele -> System.out.println(ele));

		
		
	}

}
