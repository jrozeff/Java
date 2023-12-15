//Dog inherits from Mammal class
class Mammal {
	String name;

	// Constructor
	public Mammal() {
		setName("Mammal");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name.toUpperCase();
	}
}

class Dog extends Mammal {
	public Dog() {
		setName("Dog");
	}
	public void bark() {
		System.out.println("Woof");
	}
}

//------------------------------------------------------------
class Tester {
	public static void main (String [] args) {

		// Declare a new object of Mammal m and m2, new Dog object d 
		Mammal m = new Mammal();
		System.out.println("Name: " + m.getName());

		Dog d = new Dog();
		System.out.println("Name: " + d.getName());
		d.bark();		// Upcasting Ex.

		Mammal m2 = new Dog();
		System.out.println("Name: " + d.getName());
		d.bark();  

		// Upcasting is always safe 
		// m = d;

		// Downcasting is not safe unless you specifically tell the compilier 
		// If you are wrong you will get a run time error
		// d = m;
	}

}