import java.util.ArrayList;

public class Organizer {
	
	
	public Organizer() {
		
	}
	
	//Method takes in an arraylist of vulnerability and adds cost estimates to each
	//PATRICK'S PART
	public void addCostEstimates(ArrayList<Vulnerability> list) {
		
		for(Vulnerability vuln : list) {
			int id = vuln.getPluginId();
			
			if(id == 104743 || id == 121010) {
				
				vuln.setCost("$10");
				vuln.setTimeToFix("5 minutes");
				
			} else if (id == 41028 || id == 18405 || id == 57690 
					|| id == 108752) {
				  
				vuln.setCost("$15");
				vuln.setTimeToFix("10 minutes");
				
			} else if (id == 58987 || id == 60085 || id == 90192 || id == 58966 
					|| id == 58988 || id == 59056 || id == 59529 || id == 64992 
					|| id == 66584 || id == 71426 || id == 77285 || id == 11213 
					|| id == 51192 || id == 58453 || id == 66842 || id == 67259 
					|| id == 73289) {
				
				vuln.setCost("$30");
				vuln.setTimeToFix("20 minutes");
				
			} else if (id == 79638 || id == 125313 || id == 58435 || id == 77531 
					|| id == 97833 || id == 100995 || id == 101787 || id == 134862 
					|| id == 12085 || id == 57608 || id == 57791 || id == 62101 
					|| id == 64912 || id == 65821 || id == 68915 || id == 73405 
					|| id == 90510) {
				
				vuln.setCost("$50");
				vuln.setTimeToFix("30 minutes");
				
			} else if (id == 83875) {
				
				vuln.setCost("$100");
				vuln.setTimeToFix("1 hour");
				
			} else if (id == 42873 || id == 31705) {
				
				vuln.setCost("$50 - $100");
				vuln.setTimeToFix("30 minutes - 1 hour");
				
			} else if (id == 108797) {
				
				vuln.setCost("$150 - $525");
				vuln.setTimeToFix("30 minutes - 2 hours");
				
			} else if (id == 35291) {
				
				vuln.setCost("$160- $639");
				vuln.setTimeToFix("30 minutes");
				
			} else if (id == 45411) {
				
				vuln.setCost("$373");
				vuln.setTimeToFix("1 hour");

			} else if (id == 57582) {
				
				vuln.setCost("$250");
				vuln.setTimeToFix("1 hour");
				
			} else {
				
				vuln.setCost("N/A Talk to IT Professional");
				vuln.setTimeToFix("N/A Talk to IT Professional");
			} 
		}	
	}
	
	//Method takes in an arraylist of vulnerability and organizes it first by highest risk first, then by cheapest cost
	//Example: Risk High cost $50 would be first, Risk High cost $100 second, Risk Medium cost $20 third, etc.
	//ELI'S PART
	public ArrayList<Vulnerability> organizeList(ArrayList<Vulnerability> list) {
		
		
		
	
		return list;
	}
	

	
	
	

}
