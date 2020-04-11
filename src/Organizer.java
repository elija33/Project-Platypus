import java.util.ArrayList;

public class Organizer {
	
	
	public Organizer() {
		
	}
	
	//Method takes in an arraylist of vulnerability and adds cost estimates to each
	//PATRICK'S PART
	public void addCostEstimates(ArrayList<Vulnerability> list) {
		
		for(Vulnerability vuln : list) {
			
			if(vuln.getPluginId() == 123) {
				vuln.setCost("$25");
				vuln.setTimeToFix("15 minutes");
			} else if (vuln.getPluginId() == 456) {
				vuln.setCost("$50");
				vuln.setTimeToFix("30 minutes");
			} else if (vuln.getPluginId() == 789) {
				vuln.setCost("$100");
				vuln.setTimeToFix("1 hour");
			} else if (vuln.getPluginId() == 000) {
				vuln.setCost("$200");
				vuln.setTimeToFix("2 hours");
			} else {
				vuln.setCost("N/A");
				vuln.setTimeToFix("N/A");
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
