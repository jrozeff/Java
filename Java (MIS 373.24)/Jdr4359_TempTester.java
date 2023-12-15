import java.util.Scanner;

public class Jdr4359_TempTester {
	public static void main(String [] args) {		
		// Scanner input = new Scanner(System.in);

		System.out.println();
		// System.out.println("Enter a temperature (in Faherenheit): ");
		// double temp = input.nextDouble();
		Jdr4359_Temperature t1 = new Jdr4359_Temperature ();
		t1.setFahrenheit(140);
		System.out.println("That temperature in Celsius is: " + t1.getAsCelsius());

		// System.out.println("Enter a temperature (in Celsius): ");
		// temp = input.nextDouble();
		Jdr4359_Temperature t2 = new Jdr4359_Temperature();
		t2.setCelsius(60);
		System.out.println("That temperaure in Fahrenheit is: " + t2.getAsFahrenheit());
	}

}