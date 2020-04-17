import java.util.ArrayList;
import java.util.Arrays;

public class main{

	public static void main (String[] args) {

		Vulnerability vuln1 = new Vulnerability();
		Vulnerability vuln2 = new Vulnerability();
		Vulnerability vuln3 = new Vulnerability();
		Vulnerability vuln4 = new Vulnerability();
		Vulnerability vuln5 = new Vulnerability();
		Vulnerability vuln6 = new Vulnerability();
		Vulnerability vuln7 = new Vulnerability();
		Vulnerability vuln8 = new Vulnerability();
		Vulnerability vuln9 = new Vulnerability();
		Vulnerability vuln10 = new Vulnerability();

		ArrayList<Vulnerability> PatrickTestList = new ArrayList<Vulnerability>();
		ArrayList<Vulnerability> EliTestList = new ArrayList<Vulnerability>();

		vuln1.setName("Vuln 1");
		vuln1.setPluginId("104743");
		vuln1.setRisk("Medium");

		vuln2.setName("Vuln 2");
		vuln2.setPluginId("41028");
		vuln2.setRisk("High");

		vuln3.setName("Vuln 3");
		vuln3.setPluginId("58987");
		vuln3.setRisk("Critical");

		vuln4.setName("Vuln 4");
		vuln4.setPluginId("79638");
		vuln4.setRisk("High");
		
		vuln5.setName("Vuln 5");
		vuln5.setPluginId("42873");
		vuln5.setRisk("Low");
		
		vuln6.setName("Vuln 6");
		vuln6.setPluginId("108797");
		vuln6.setRisk("Medium");
		
		vuln7.setName("Vuln 7");
		vuln7.setPluginId("34460");
		vuln7.setRisk("High");
		
		vuln8.setName("Vuln 8");
		vuln8.setPluginId("35291");
		vuln8.setRisk("Low");
		
		vuln9.setName("Vuln 9");
		vuln9.setPluginId("10107");
		vuln9.setRisk("None");
		
		vuln10.setName("Vuln 10");
		vuln10.setPluginId("125313");
		vuln10.setRisk("Critical");


		PatrickTestList.add(vuln1);
		PatrickTestList.add(vuln2);
		PatrickTestList.add(vuln3);
		PatrickTestList.add(vuln4);
		PatrickTestList.add(vuln5);
		PatrickTestList.add(vuln6);
		PatrickTestList.add(vuln7);
		PatrickTestList.add(vuln8);
		PatrickTestList.add(vuln9);
		PatrickTestList.add(vuln10);

		
		Organizer organizer = new Organizer();
						
		for(Vulnerability vuln : PatrickTestList) {
			System.out.print(vuln.getName() + " | ");
			System.out.print(vuln.getRisk() + " - ");
			System.out.println(vuln.getCost());

		}
		
		System.out.println("\nADDING COSTS\n");

		organizer.addCostEstimates(PatrickTestList);
		
		for(Vulnerability vuln : PatrickTestList) {
			System.out.print(vuln.getName() + " | ");
			System.out.print(vuln.getRisk() + " - ");
			System.out.println(vuln.getCost());
		}
		
		System.out.println("\nSORTING BY PRIORITY\n");
		
		EliTestList = organizer.organizeList(PatrickTestList);
		
		for(Vulnerability vuln : EliTestList) {
			System.out.print(vuln.getName() + " | ");
			System.out.print(vuln.getRisk() + " - ");
			System.out.println(vuln.getCost());
		}





	}
}
