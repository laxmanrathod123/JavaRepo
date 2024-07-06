package LinkedHashSetExample;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDublicateFromArrayToLinkeHashSet {

	public static void main(String[] args) {

		int num[]= {20, 30, 50, 30, 40, 80, 10, 10};
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		for(int i=0; i<num.length; i++)
		{
			arr.add(num[i]);
		}
		
		System.out.println("Original list :"+ arr);
		System.out.println("Removing the dublicate from the list");
		LinkedHashSet<Integer> lsh= new LinkedHashSet<Integer>(arr);
		System.out.println("Dublicate remove:"+lsh);
		
		
	}

}
