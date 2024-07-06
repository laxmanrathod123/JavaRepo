package AbstractionOOPSConcepts;

public class ChildEmirates extends ParentAircraft {
	
	public static void main(String[]args) {

	ChildEmirates child= new ChildEmirates();
	//child.bodyColour();
	child.engine();
	child.saftyGuidline();
	
		
	}
	@Override
	public void bodyColour() {
     System.out.println("Red colour on the body");	

}
}
