// This program writes data to a file

import java.util.Scanner;
import java.io.*;


public class FileWriteDemo {
	public static void main (String [] args) throws IOException {
		String filename;
		String friendName;
		int numFriends;

		// Create Scanner object (keyboard) for input 
		Scanner keyboard = new Scanner(System.in);

		// Get number of friends 
		System.out.print("How many friends do you have? ");
		numFriends = keyboard.nextInt();

		// Consume the remaining newline character 
		keyboard.nextLine();

		// Get the filename 
		System.out.print("Enter the filename: ");
		filename = keyboard.nextLine();

		// Open the file
		PrintWriter outputFile = new PrintWriter(filename);

		// Get data and write it to the file 
		for (int i = 1; i <= numFriends; i++) {
			// Get name of friend 
			System.out.print("Enter name of friend number " + i + ": ");
			friendName = keyboard.nextLine();

			// Write name to the file 
			outputFile.println(friendName);
		}

		// Close file
		outputFile.close();
		System.out.println("Data written to file: " + filename);
	}
}