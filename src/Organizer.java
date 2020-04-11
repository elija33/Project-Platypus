import java.util.ArrayList;

public class Organizer {
	
	Vulnerability vuln1 = new Vulnerability();
	Vulnerability vuln2 = new Vulnerability();
	Vulnerability vuln3 = new Vulnerability();


	
	ArrayList<Vulnerability> list = new ArrayList<Vulnerability>();
	
	public Organizer(ArrayList<Vulnerability> list) {
		this.list = list;
		
		vuln1.setName("Vuln 1");
		vuln1.setPluginId("123");
		vuln1.setRisk("High");
		
		vuln2.setName("Vuln 2");
		vuln2.setPluginId("456");
		vuln2.setRisk("Medium");
		
		vuln3.setName("Vuln 3");
		vuln3.setPluginId("789");
		vuln3.setRisk("Low");
	}
	
	//Method takes in an arraylist of vulnerability and adds cost estimates to each
	//PATRICK'S PART
	public ArrayList<Vulnerability> addCostEstimates(ArrayList<Vulnerability> list) {
		
		
		
		
		
		
		return list;
		
	}
	
	//Method takes in an arraylist of vulnerability and organizes it first by highest risk first, then by cheapest cost
	//Example: Risk High cost $50 would be first, Risk High cost $100 second, Risk Medium cost $20 third, etc.
	//ELI'S PART
	public ArrayList<Vulnerability> organizeList(ArrayList<Vulnerability> list) {
		
		
		
	
		return list;
	}
	
	
	

}
