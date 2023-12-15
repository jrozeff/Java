
class IfTester {
	public static void main (String [] args) {

		int balance = 1000000;	 // this is my $1,000,000 account balance 

		if (balance >= 1000000) {
			System.out.println("Dang! You are a baller!");
		} else {
			System.out.println("You are in the minor leagues");
		}

		// Here are some Java syntax rules that will help you:
		/* == check if two values are equal 
			  use this for primitive vars and .equals() for class vars 
		   != is the not equal operator 
		   && is the AND operator 
		   	  this evaluates as true if BOTH booleans passed in are true
		   || is the OR operator 
		      this evaluates as true if one OR both values passed in are true */

		int salary = 20000;	   // TA salary of $20,000

		if (balance == 1000000 || salary > 100000) {
			System.out.println("Dang! You are a baller!");
		} else {
			System.out.println("You are in the minor leagues");
		}

		if (balance == 1000000 || salary > 10000) {
			System.out.println("Dang! You are a baller!");
		} else {
			System.out.println("You are in the minor leagues");
		}
	}
}


class LoopTester {

	public static void main (String [] args) {
		int count = 0;
		while (count < 3) {
			System.out.println("Count: " + count);
			count += 1;
		}
	}
}


class LoopArray {
	public static void main (String [] args) {
		// This is an array literal 
		String [] fruits = {"blueberries", "mangoes", "dragonfruits"};

		System.out.println("The TAs have made you a smoothie with... ");

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
	}
}


class HumorTester {
	public static void main (String [] args) {

		int a = 3;
		int b = 7;
		int c = 4;

		System.out.println("I love hearing jokes in MIS" + (a++) + (b++) + (--c));
		
	}
}