package ArrayListAddMethod;

import java.util.ArrayList;

public class AllDataTypeArrayList {
	
	public void IntegerArrayList() {
		ArrayList<Integer>ar= new ArrayList<Integer>();
		ar.add(1233);
		ar.add(1233);
		System.out.println(ar);
	}
	
	public void StringArrayList() {
		ArrayList<String>ar= new ArrayList<String>();
		ar.add("pune");
		ar.add("mumbai");
		System.out.println("get method use: "+ar.get(1));
		System.out.println(ar);
	}
	
	public void floatArrayList() {
		ArrayList<Float>ar= new ArrayList<Float>();
		ar.add(122f);
		ar.add(12f);
		System.out.println(ar);
	}

	public void DoubleArrayList() {
		ArrayList<Double>ar= new ArrayList<Double>();
		ar.add(12.232);
		ar.add(12.2345);
		System.out.println(ar);
	}
	
	public void charArrayList() {
		ArrayList<Character>ar= new ArrayList<Character>();
		ar.add('l');
		ar.add('p');
		System.out.println(ar);
	}
	
	public static void main(String[]args) {
		AllDataTypeArrayList obj= new AllDataTypeArrayList();
		obj.IntegerArrayList();
		obj.StringArrayList();
		obj.floatArrayList();
		obj.DoubleArrayList();
		obj.charArrayList();
	}

}
