import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CSVReader {
	
	public CSVReader(String csvfile) throws FileNotFoundException  {
		
		//Get scanner instance
        Scanner scanner = new Scanner(new File(csvfile));
        Vulnerability vuln = new Vulnerability();
         
        //Set the delimiter used in file
        scanner.useDelimiter(",");
        int counter = 1;
        int lineskip = 0;
        String nextfield;
        //Get all tokens and store them in some data structure
        //I am just printing them
        while (scanner.hasNext()) 
        {
        	if (lineskip == 0) {
        		nextfield = scanner.next();
        		counter++;
        		if (counter == 13) {
        			lineskip = 1;
        			counter = 1;
        		}
        	}
        	else {
        		nextfield = scanner.next().trim();
        		System.out.println(nextfield);
        		Splitter(nextfield, counter, vuln);
        		counter++;
            		if (counter == 13) {
            			break;
            	}
        	}
        }
         
        //Do not forget to close the scanner  
        scanner.close();
	}
	
	public void Splitter(String input, int fieldCheck, Vulnerability vuln ) {
		
		switch(fieldCheck) {
			case 1 : 	vuln.setPluginId(input);
						break;
			case 2 : 	vuln.setCVE(input);
						break;
			case 3 : 	vuln.setCVSS(input);
						break;
			case 4 : 	vuln.setRisk(input);
						break;
			case 5 : 	vuln.setHost(input);
						break;
			case 6 : 	vuln.setProtocol(input);
						break;
			case 7 : 	vuln.setPort(input);
						break;
			case 8 : 	vuln.setName(input);
						break;
			case 9 : 	vuln.setSynopsis(input);
						break;
			case 10 : 	vuln.setDescription(input);
						break;
			case 11 : 	vuln.setSolution(input);
						break;
			case 12 : 	vuln.setSeeAlso(input);
						break;
		}
	}
	
	public void placer(Vulnerability vuln) {
		
		System.out.print(vuln);
	}
}

