class Jdr4359_Event implements Jdr4359_Sellable {
	private String name;
	private int days;
	private int pricePerDay;

	public Jdr4359_Event (String name, int days, int pricePerDay) {
		this.name = name;
		this.days = days;
		this.pricePerDay = pricePerDay;
	}

	public String getName () {
		return name;
	}

	public int getPrice () {
		return days * pricePerDay;
	}
}

