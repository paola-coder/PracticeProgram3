import java.util.Random;
// done by Paola Menidzabal and Danielle Wagner
public class PracticeProgramThree{
	;

	private String states;
	
	Random random = new Random();

	
	public PracticeProgramThree () {
	
		
		
		
//		String states = random.toString();
	
		String states = "open" + "closed" ;
//		 String T = "open" ;
//		 String F = "closed";
			
	
	
		
	}
	
	public PracticeProgramThree (String openClosed) {
		
		states= openClosed;
	}
	public void changeStates (String newStates) {
		states=newStates;
	}
	public String getStates() {
	
	return states ;
	
}
	public void door () {
	
		
	
	}	
	
	
}