package Platypus;
/**
 * CSVReaderTwo is the current iteration of the CSV parsing method for Project Platypus.
 * 
 * @author Kevin Kropinack, John Gaffney
 * @2.0
 * @since April 9, 2020
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Pattern; 

public class CSVReaderTwo 
{
	static ArrayList<String> everything = new ArrayList<String>();
	
	/**
	 * The main method that fills everything with the values in the file 
	 * and then prints it to the screen.
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		fillEverything(everything, "C:\\Users\\kkrop\\Downloads\\win2008_M3 - win2008_M3.csv");
		//printEverything(everything);
		printSome(everything, 40);
	}
	
	/**
	 * Prints out the contents of everything to the screen.
	 * @param everything
	 */
	public static void printEverything(ArrayList<String> everything)
	{
		for(int x = 0; x < (everything.size()); x++)
		{
			System.out.println(everything.get(x));
		}
	}
	
	public static void printSome(ArrayList<String> everything, int z)
	{
		for(int i = 0; i < z; i++)
		{
			//System.out.println(everything.get(i));
			System.out.println(everything.get(i) + i);		//THIS IS FOR TESTING LINE NUMBERS. REMOVE BEFORE IMPLEMENTING 
		}
	}
	
	/**
	 * Passes in an ArrayList and a file path and populates the ArrayList
	 * with all the comma-separated values in the file.
	 * @param everything
	 * @param path
	 * @throws FileNotFoundException
	 */
	public static void fillEverything(ArrayList<String> everything, String path) throws FileNotFoundException
	{
		//int counter = 0;
		//boolean afterFirst = false;
		Scanner scanner = new Scanner(new File(path));
		while(scanner.hasNext())
		{
			scanner.useDelimiter(",");
			//if((afterFirst == true) && ((counter % 12) == 0))
			//{
				//scanner.useDelimiter("\\s\\s");
			//}
			everything.add(scanner.next().trim());
			//counter++;
			//afterFirst = true;
		}
		scanner.close();
	}
	/**
	 * Returns the ArrayList everything.
	 * @return everything The ArrayList that contains all values from the CSV.
	 */
	public ArrayList<String> getEverything()
	{
		return everything;
	}

}


