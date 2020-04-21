import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CSVReader {
	
	ArrayList<Vulnerability> vulnList = new ArrayList<Vulnerability>();
	
	public CSVReader(File csvfile) throws FileNotFoundException  {
		
	
        Scanner scanner = new Scanner(csvfile);
        Vulnerability vuln = new Vulnerability();
         
        scanner.useDelimiter(",");                             // Set delimiter to comma for CSV file
        Pattern p = Pattern.compile("\"[^\"]*\"");             // Matches quoted field without commas between quotes
        int fieldCounter = 1;				       // Use as numerical place holder for each field
        Boolean lineskip = true;			       // Used to skip first line
        String nextField;                                      // Holds string of current column/row
        String addLine;					       // Holds scanner.next() to add line if comma is within a field
        
        
        while (scanner.hasNext()) 
        {
            if (lineskip) {                                    // Skips first Line of CSV which is Column names
       		nextField = scanner.next();
       		fieldCounter++;
       		if (fieldCounter == 13) {
       			lineskip = false;
       			fieldCounter = 1;
       		}
       	}
       	    else {
       		nextField = scanner.next().trim();                 // reads next field and takes off excess whitespace 
       		
       		if (fieldCounter == 1 && nextField.isEmpty()) {    // Breaks the loop when there is "" in PLuginID
       			break;	
       		}   
       		
       		Matcher m = p.matcher(nextField);                  // Sets m to match field to the pattern p
       		
		if (nextField.contains("\"")) {			   // Checks if field contain "
        	    if(!m.find()) {				   // If contains " but does not include pattern
        		do {					   // Adds lines to field until line includes another " 
        		    addLine = scanner.next();
       			    nextField = nextField + addLine;
  			} while (!addLine.contains("\""));	
       		}		
       	    }
        		
       		Splitter(nextField, fieldCounter, vuln);	   // Sends field, counter number and current vulnerability object
       		fieldCounter++;
		if (fieldCounter == 13) {			   // Check counter for end of row
            		AddVulnToList(vuln, vulnList);	           // Adds vulnerability to list
       			fieldCounter = 1;			   // Resets counter
       			vuln = new Vulnerability();		   // Resets vulnerability object
            			
            	}
        }
    }
        
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
	
	public void AddVulnToList(Vulnerability vuln, ArrayList<Vulnerability> list) {
		
		list.add(vuln);
		
	}
}
