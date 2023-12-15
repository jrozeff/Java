// This program reads the first line from a fle

import java.util.Scanner;
import java.io.*;

public class ReadFirstLine {
	public static void main (String [] args) throws IOException {
		// Create a Scanner object (keyboard) for input 
		Scanner keyboard = new Scanner(System.in);

		// Get the file name
		System.out.print("Enter the name of a file: ");
		String filename = keyboard.nextLine();

		// Open the file
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		// Read the first line from the file 
		String line = inputFile.nextLine();

		// Display the line
		System.out.println("The first line in the file is: ");
		System.out.println(line);

		// Close the file
		inputFile.close();
	}
}