package Java8Feature;

public class RunnableEx {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Inside the runnable 1");
			}
		};
		new Thread(runnable).start();
		
		// java 8 Lambda
		// () -> {};
		
		Runnable lambdarunnable=() -> {
			
			System.out.println("I am inside the Runnable 2 lambda");
		};
		new Thread(lambdarunnable).start();
		
		
		Runnable lambdarunnable1=()->System.out.println("In one single shot");
		new Thread(lambdarunnable1 ).start();
	}

}
