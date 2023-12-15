// The Die class simulates six-sided die

import java.util.Random;

class Die {
	private int sides;
	private int value;

	// Rolls die
	public Die(int numSides) {
		sides = numSides;
		roll();
	}

	// Simulate rolling of die
	public void roll() {
		// Create a Random object
		Random rand = new Random();

		// Get a random value for the die
		value = rand.nextInt(sides) + 1;
	}

	// Return the number of sides for this die
	public int getSides() {
		return sides;
	}

	// Return the value of the die
	public int getValue() {
		return value;
	}
}