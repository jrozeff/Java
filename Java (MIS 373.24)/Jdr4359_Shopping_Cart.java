import java.util.ArrayList;

class Jdr4359_Shopping_Cart {
	private ArrayList items;
	private int totalPrice;
	private int cartSize;


	public Jdr4359_Shopping_Cart () {
		ArrayList items = new ArrayList();
		totalPrice = 0;
	}

	public Jdr4359_Shopping_Cart (ArrayList itemsPassedIn) {
		this(); // calls the constructor above to initialize the items ArrayList
		for (Object cartItemObject : itemsPassedIn) {
			Jdr4359_Sellable item = (Jdr4359_Sellable) cartItemObject;
			addItemToCart( item ); // assumes you have already written the addItemToCart method
		}
	}

	public void addItemToCart (Jdr4359_Sellable item) {
		System.out.println("Added " + item.getName() + " costing $" + item.getPrice() + " to cart.");
	}

	public int getCartItemCount () {
		cartSize =  items.size();
		return cartSize;
	}

	public int getCartTotalPrice() {
		for (Object cartItemObject : items) {
			Jdr4359_Sellable item = (Jdr4359_Sellable) cartItemObject;
			totalPrice = totalPrice + item.getPrice();
		}
		return totalPrice;
	} 

	public void printToScreen () {
		for (Object cartItemObject : items) {
			Jdr4359_Sellable item = (Jdr4359_Sellable) cartItemObject;
			System.out.println("Number of cart items is: " + cartSize);
			System.out.println("Total price of cart items is: $" + totalPrice);
		}
	}
}
