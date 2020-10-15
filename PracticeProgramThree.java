import java.util.Random;
// done by Paola Menidzabal and Danielle Wagner
public class PracticeProgramThree{
	;

	private String states;
	
	Random random = new Random();

	
	public PracticeProgramThree () {
	
		String state2 = "open" ;
	}
	
	public PracticeProgramThree (String openClosed) {
		
		state2= openClosed;
	}
	public void changeStates (String newStates) {
		state2=newStates;
	}
	public void getStates() {
	if (state2.equalsIgnoreCase("open") ) {
	System.out.println("The door is closed");}
	else { 
	System.out.println("The door is open");}}

	
	
}
	
	
	
}
