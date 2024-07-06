package EnumSet;

import java.util.EnumSet;
import java.util.Iterator;

public class PracticeClassOfEnumSet {

	public enum studentname{
		laxman,Kailas,Rathod,priyanka,Satrughan,Vilas,Vikas
	}
	
	public static void main(String[] args) {
	EnumSet<studentname>stdname=EnumSet.allOf(studentname.class);
	Iterator <studentname>itr=stdname.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	       }
	}

	
		
		
	


