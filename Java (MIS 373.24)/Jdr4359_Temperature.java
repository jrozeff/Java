class Jdr4359_Temperature {
	private double fahrenheit;
	private double celsius;

	public Jdr4359_Temperature () {
		this.fahrenheit = 0;
		this.celsius = 0;
	}

	public double getAsFahrenheit () {
		fahrenheit = 9 * (celsius/5.0) + 32;
		return fahrenheit;
	}

	public double getAsCelsius () {
		celsius = (fahrenheit-32) * (5/9.0);
		return celsius;
	}

	public void setFahrenheit (double tempF) {
		fahrenheit = tempF;
		// System.out.println("Anything");
	}

	public void setCelsius (double tempC) {
		celsius = tempC;
	}

}