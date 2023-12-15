//-----------------------------------
//Person
import java.util.ArrayList;

class Person {
	private String name;
	private ArrayList friendArrayList;

	// Constructor 
	public Person (String name) {
		this.name = name; 
		// Initialize ArrayList
		this.friendArrayList = new ArrayList();
	}

	public String getName() {
		return name;
	}

	// Add friends by accepting a Person array paramter. 
	public void addFriends (Person [] potentialFriendsArray) {
		for (int i = 0; i < potentialFriendsArray.length; i++) {
			friendArrayList.add(potentialFriendsArray[i]);
		}
	}

	// Add friends by accepting a Person ArrayList parameter.
	// ArrayList store objects as Object types (Upcasting).
	// So we have to downcast the Object to type Person.
	public void addFriends (ArrayList potentialFriendArrayList) {
		for (Object friendObject : potentialFriendArrayList) {
			Person potentialFriend = (Person) friendObject;
			friendArrayList.add(potentialFriend);
		}
	}

	// Person class listing friends by iterating through 
	// its friendList ArrayList.
	public void listFriends () {
		System.out.println("My name is " + name);
		System.out.println("I have " + friendArrayList.size() + " friends.");
		for (Object friendObject : friendArrayList) {
			Person friend = (Person) friendObject;
			System.out.println("My friends include " + friend.getName());
		}
	}
}

//-----------------------------------------------------------------------------------------------
// Person Tester 
class PersonTester {
	public static void main (String [] args) {
		// Initialize arraylist
		ArrayList friendArrayList = new ArrayList();

		// Initialize array
		Person [] friendArray = new Person [2];

		// Create objects of type Person
		Person p1 = new Person("Peter");
		Person p2 = new Person("Jane");
		Person p3 = new Person("Paul");
		Person p4 = new Person("Stacy");

		// Add some person objects to our ArrayList 
		friendArrayList.add(p1);
		friendArrayList.add(p2);

		// Add some person objects to our Person array 
		friendArray[0] = p3;
		friendArray[1] = p4;

		Person chloe = new Person("Chloe");
		//Add Friends for Chloe from the friendArray
		// and friendList local variables
		chloe.addFriends(friendArray);
		chloe.addFriends(friendArrayList);

		// List Chloe's friends
		chloe.listFriends();

	}
}