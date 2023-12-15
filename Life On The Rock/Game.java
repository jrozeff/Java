// Life On the Rock: Game class 

import java.util.Scanner;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Set;
// import java.lang.*;

class Game {
	public static void main (String [] args) {
		System.out.println();
		System.out.println();
		System.out.println("----|----------|----------|--------------|-------------");
		System.out.println("--------|----------------------------------------|-----");
		System.out.println("--|--------- Welcome to Life on the Rock--------------|");
		System.out.println("-----------|-------------------|-------------|---------");
		System.out.println("----|----------------|-----------------|-----------|---");
		System.out.println();
		System.out.println("Before we begin, please follow the instructions as your");
		System.out.println("     input will serve as your game's environment.      ");
		System.out.println();
		System.out.println();
		System.out.println();

		// Take input for grid size and iteration count
		Scanner input = new Scanner(System.in);
		System.out.println("Enter preferred grid size below:");

		// grid Scanner object
		int gridObj = input.nextInt();
		System.out.println();

		// New Grid object
		Grid g1 = new Grid();
		g1.setGridSize(gridObj);
		System.out.println("Grid size: " + g1.getGridSize() + "x" + g1.getGridSize());
		System.out.println();
		System.out.println();
		System.out.println("Enter iteration count below:");

		// iteration Scanner object
		int iterationObj = input.nextInt();
		System.out.println();

		//Iterations i1 = new Iterations();
		g1.setiCount(iterationObj);
		System.out.println("Game iterations: " + g1.getiCount());
		System.out.println();

		System.out.println();
		g1.iterateGame();



	}
}