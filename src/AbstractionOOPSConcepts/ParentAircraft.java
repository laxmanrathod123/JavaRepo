package AbstractionOOPSConcepts;

public abstract  class ParentAircraft {
	
	public void engine() 
	{
		System.out.println("Follow the engine guideline");
	}

	public void saftyGuidline()
	{
		System.out.println("follow the safteyGuidelilne");
	}
	
	public abstract  void bodyColour();
}
