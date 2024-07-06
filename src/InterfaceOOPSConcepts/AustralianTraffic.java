package InterfaceOOPSConcepts;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic{
	
	public static void main(String[]args) {
		//AustralianTraffic obj= new AustralianTraffic();
		CentralTraffic obj= new AustralianTraffic();
		//ContinentalTraffic obj1= new AustralianTraffic();
		
		obj.greenGo();
		obj.redStop();
		obj.flashYellow();
		
		AustralianTraffic mymethod= new AustralianTraffic();
		mymethod.extraMethod();
	
		
		ContinentalTraffic ct= new AustralianTraffic();
		ct.TrainSymbol();
		
}

	@Override
	public void greenGo() {
System.out.println(" we are inside green go");		
	}

	public void extraMethod()
	{
		System.out.println(" I am inside my extra method");		
	}
	@Override
	public void redStop() {
		System.out.println(" we are inside red stop");		
	}

	@Override
	public void flashYellow() {
		System.out.println(" we are inside flash yellow ");				
	}

	@Override
	public void TrainSymbol() {
		System.out.println(" I am inside this other interface method ");
	}
	
}
