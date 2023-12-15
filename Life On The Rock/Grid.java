// Life On the Rock: Grid class
import java.util.*;


class Grid {
	private int gridSize;
	private int newGridSize;

	private int iCount;
	private int newiCount;

	//private String Cell = "** ";
	private StringBuffer Cell = new StringBuffer("** ");
	private int gTotal;
	private double fernContent;
	private double grassContent;
	private double cowContent;
	private double lionContent;


	public Grid () {
		// Default grid size = 7x7, default iteration count = 5
		this.gridSize = (7);
		this.iCount = (5);
	} 

	public void setGridSize (int userInput) {
		gridSize = userInput;
	} 

	public int getGridSize () {
		newGridSize = gridSize;
		return newGridSize;
	}

	public void createGrid () {
		int count1 = 0;
		int count2;
		
		// Creates Random char variable 
		Random rnd = new Random();
		Random rd = new Random();
		char c = (char) (rnd.nextInt(5) + 'L');
		char b = (char) (rd.nextInt(5) + 'L');

		// char Strings 
		String chars = "LCGF*";
		String content = "LCGF*";
		c = chars.charAt(rnd.nextInt(chars.length()));
		b = content.charAt(rd.nextInt(content.length()));

		// Starts new line every count
		while (count1 < newGridSize) {
			count2 = 0;
			// Prints ** horizontally
			while (count2 < newGridSize) {
				// print will not start a new line
				System.out.print(c); 
				System.out.print(b + " ");
				count2++;
			}
			count1++;
			System.out.print("\n"); 
		}	
	}


	public void gContent () {
		gTotal = newGridSize * newGridSize;
		fernContent = gTotal * 0.40;
		grassContent = gTotal * 0.30;
		cowContent = gTotal * 0.20;
		lionContent = gTotal * 0.08;
	}


	// Iteration methods below 

	public void setiCount (int itCount) {
		iCount = itCount;
	}

	public int getiCount () {
		newiCount = iCount;
		return newiCount;
	}
	
	public int iterateGame () {
		//getGridSize();

		int i = 0;
		while (i < newiCount) {
			System.out.println("Iteration: " + i);
			System.out.println("-----------------------------------");
			createGrid();
			System.out.println();
			System.out.println();
			i++;
		}

		return newiCount;
	}
}