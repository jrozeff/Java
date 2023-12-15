import.java.util.*

class GridExceptions {
	public static boolean checkGridSize ()
	
	throws InvalidGridSizeException {
		if (userInput < 5 | userInput > 10) {
			throw new InvalidGridSizeException();
		}
	}


	try {
		public void setGridSize (int userInput) {
			gridSize = userInput;
		}
	} 
	catch (InvalidGridSizeException igse) {
		System.out.println("EXC 001: Invalid grid size entered!");
	} 

}