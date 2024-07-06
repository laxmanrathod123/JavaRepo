package InheritanceByPavan;



class Parent{
int a;
void show(int a) {
	System.out.println(a);
}
}

class child1 extends Parent{
	void display(String name ) {
		System.out.println(name);
	}
}

class child2 extends Parent {
	void print(String zerox) {
		System.out.println(zerox);
	}
}

public class hierarchyInheritance {
public static void main(String [] args) {
	
	child1 obj= new child1();
	obj.show(100);
	obj.display("Laxman");
}
}
