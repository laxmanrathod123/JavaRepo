package EnumSet;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetExample {

	  enum Lang{JAVA,RUBBY,CSHARP,PYTHON,JAVASCRIPT}

	public static void main(String []args) {

		// for printing all the element present in the enum set
		EnumSet <Lang> langs=EnumSet.allOf(Lang.class);
		System.out.println("printing all the element in the enum : "+langs);


		// for printing the empty set
		EnumSet <Lang> emptyset= EnumSet.noneOf(Lang.class);
		System.out.println("printing the empty set of the enum : "+emptyset);

		// for priting the range of the enum from e1 to e2 

		EnumSet <Lang> range= EnumSet.range(Lang.JAVA, Lang.PYTHON);
		System.out.println("printing the range the enum : "+range);

		// we can crate the single enum set
		EnumSet <Lang> enumset= EnumSet.of(Lang.JAVA);
		System.out.println(" we have created the single enum set : "+enumset);

		// we can crate the single enum set
		EnumSet <Lang> multiple= EnumSet.of(Lang.JAVA, Lang.RUBBY);
		System.out.println(" we have created multiple enum set : "+multiple);

		EnumSet <Lang> lang1=EnumSet.allOf(Lang.class);
		EnumSet <Lang>lang2 = EnumSet.noneOf(Lang.class);
		System.out.println("empty enum :"+lang2);
		lang2.add(Lang.JAVA);
		System.out.println("after adding the element in the empty enum :"+lang2);
		lang2.addAll(lang1);
		System.out.println("after adding all the element in the empty enum :"+lang2);


		// how to iterate in the enum
		System.out.println("** Printing the enum by using iterator***");
		EnumSet <Lang> fulllang=EnumSet.allOf(Lang.class);
		Iterator<Lang>itr=fulllang.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//System.out.print(" , ");
		}
		// remove() and removeAll() method 

		EnumSet <Lang> newlang=EnumSet.allOf(Lang.class);
		boolean b= newlang.remove(Lang.JAVA);
		System.out.println(b);
		System.out.println(newlang);
		boolean b1= newlang.removeAll(newlang);
		System.out.println(b1);
		System.out.println(newlang);
	}


}
