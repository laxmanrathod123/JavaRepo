package FinallyBlock;

public class Examples {

	int a =1;
	int b=0;
	public void getData()
	{
		try {
			int c=a/b;
		}catch(Exception e)
		{
			System.out.println("I am in catch block");
		}
		finally {
			System.out.println("I am in finally block ");
		}
		
	}
	public static void main(String[] args) {
		Examples obj= new Examples();
		obj.getData();
	}

}
