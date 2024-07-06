package ConditionalStatementByPawan;

public class ifCondition {
	// if we are executing only single statement then dont need to provide the 
	//curly braces but again you need to write the statement on next line 
	// there should be no space
	// even for else block also if we have single statement then we can 
	//skip to write the curly braces
	//if we have more than one statement then curly brances is needed
	
    public static void main(String[]args) {
    	int person_age=20;
    	int nubmer=6;
    	if (nubmer%2==0) {
    		//System.out.println("Person is eligile for voting");
    		System.out.println("Even number");
    	}else {
    		//System.out.println("Person is not eligible for voting");
    		System.out.println("Not even number");
    	}
    	
    }
}
