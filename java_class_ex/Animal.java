// Animal inherits from Object class 
// class Animal {
	
// }

// class Tester {
// 	public static void main (String [] args) {
// 		Animal a = new Animal();
// 		System.out.println(a.toString());
// 	}
// }


// Abstract Class Animal inherits from Object class 

public abstract class Animal {
	public abstract void makeSound();
}

class Cat extends Animal {
	public void makeSound() {
		System.out.println("Meow");
	}
}

class Dog extends Animal {
	public void makeSound() {
		System.out.println("Woof");
	}
}

class Vet {
	public void handlePatient (Animal a) {
		a.makeSound();
	}
}

class Tester {
	public static void main (String [] args) {
		Vet myVet = new Vet();
		// myVet.handlePatient(new Animal());
		myVet.handlePatient(new Dog());
		myVet.handlePatient(new Cat());
	}
}
