class Jdr4359_Product implements Jdr4359_Sellable {
	private String name;
	private int price;

	public Jdr4359_Product (String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName () {
		return name;
	}

	public int getPrice () {
		return price;
	}
}