import java.util.ArrayList;
import java.util.Arrays;

public class main{

	public static void main (String[] args) {

		Vulnerability vuln1 = new Vulnerability();
		Vulnerability vuln2 = new Vulnerability();
		Vulnerability vuln3 = new Vulnerability();
		Vulnerability vuln4 = new Vulnerability();

		ArrayList<Vulnerability> PatrickTestList = new ArrayList<Vulnerability>();
		ArrayList<Vulnerability> EliTestList = new ArrayList<Vulnerability>();

		vuln1.setName("Vuln 1");
		vuln1.setPluginId("123");
		vuln1.setRisk("Medium");

		vuln2.setName("Vuln 2");
		vuln2.setPluginId("456");
		vuln2.setRisk("High");

		vuln3.setName("Vuln 3");
		vuln3.setPluginId("789");
		vuln3.setRisk("Low");

		vuln4.setName("Vuln 4");
		vuln4.setPluginId("000");
		vuln4.setRisk("High");


		PatrickTestList.add(vuln1);
		PatrickTestList.add(vuln2);
		PatrickTestList.add(vuln3);
		PatrickTestList.add(vuln4);

		//vuln1.setCost(20);
		//vuln2.setCost(50);
		//vuln3.setCost(100);
		//vuln4.setCost(200);

		EliTestList.add(vuln1);
		EliTestList.add(vuln2);
		EliTestList.add(vuln3);
		EliTestList.add(vuln4);
		
		Organizer organizer = new Organizer();
						
		for(Vulnerability vuln : PatrickTestList) {
			System.out.println(vuln.getName());
			System.out.println(vuln.getCost());
		}
		
		System.out.println("ADDING COSTS\n\n");

		organizer.addCostEstimates(PatrickTestList);
		
		for(Vulnerability vuln : PatrickTestList) {
			System.out.println(vuln.getName());
			System.out.println(vuln.getCost());
		}
		
		//organizer.organizeList(EliTestList);





	}
}
