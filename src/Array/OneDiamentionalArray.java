package Array;

public class OneDiamentionalArray {

	public static void main(String []args) {

		int ar[]= new int[2];
		ar[0]=10;
		ar[1]=20;
		for (int i=0; i<ar.length; i++) {
			System.out.println("Integer Array: "+ar[i]);
		}
		 System.out.println();

		double d[]= new double[2];
		d[0]=10.12;
		d[1]=20.23;
		for (int i=0; i<ar.length; i++) {
			System.out.println("double Array: "+ar[i]);
		}
         System.out.println();
         
		char ch[]=new char[2];
		ch[0]='L';
		ch[1]='T';
		for (int i=0; i<ar.length; i++) {
			System.out.println("char Array: "+ch[i]);
		}
		 System.out.println();

		float f[]=new 	float[2];
		f[0]=10f;
		f[1]=200f;
		for (int i=0; i<ar.length; i++) {
			System.out.println("float Array: "+f[i]);
		}
		 System.out.println();

		String str[]=new String[2];
		str[0]="Pune";
		str[1]="Mumbai";
		for (int i=0; i<ar.length; i++) {
			System.out.println("String Array: "+str[i]);
		}
	}

}
