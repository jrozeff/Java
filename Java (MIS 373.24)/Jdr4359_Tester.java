import java.util.ArrayList;

public class Jdr4359_Tester {
	public static void main (String [] args) {
		System.out.println();
		System.out.println("---------------------------");
		Jdr4359_Product p1 = new Jdr4359_Product ("Bling bling Jeans", 100);
		Jdr4359_Event e1 = new Jdr4359_Event ("Fashion Training", 5, 200);

		Jdr4359_Shopping_Cart cart = new Jdr4359_Shopping_Cart();
		cart.addItemToCart( p1 );
		cart.addItemToCart( e1 );
		cart.printToScreen();
		System.out.println("----------------------------");
		ArrayList items = new ArrayList();
		Jdr4359_Shopping_Cart cart2 = new Jdr4359_Shopping_Cart();
		cart2.addItemToCart( new Jdr4359_Product ("Dance Video", 50) );
		cart2.addItemToCart( new Jdr4359_Event ("Rumba Class", 5, 100) );
		cart2.addItemToCart( p1 );   
		cart2.addItemToCart( e1 );
		cart2.printToScreen();
		System.out.println("----------------------------");
	}
}