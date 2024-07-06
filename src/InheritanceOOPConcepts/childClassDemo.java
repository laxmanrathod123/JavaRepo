package InheritanceOOPConcepts;

public class childClassDemo extends ParentclassDemp{
	
	public void gear()
	{
		System.out.println("gear code is implemented in child  class");
	}

	public void engine()
	{
		System.out.println("new generation engine is implemented child class");
	}
	
	public void colour()
	{
		System.out.println(colour);
		System.out.println(a);
	}
	
	public void variable() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		childClassDemo cd= new childClassDemo();
		cd.gear();
		cd.brakes();
		cd.audiosystem();
		cd.colour();
		cd.engine();
		cd.variable();
		cd.audiosystem();
	}

}
