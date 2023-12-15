class Person {
	private int age;
	private String name;
 
	public Person ( String name, int age ) {
        this.name = name;
        this.age = age;
	}
	@Override
	public String toString() {
 	   return super.toString() + "\n" + this.name + " " + this.age;
	}
	@Override
	public boolean equals(Object other) {
    	if (other != null) {
        	if (other instanceof Person) {
                // Example of downcasting
                Person otherPerson = (Person) other;    
                return otherPerson.age == age && otherPerson.name.equals(name);
        	}
    	}
    	return false;
	}
}
//----------------------------------------
class Student extends Person {
	public Student ( String name, int age ) {
    	super ( name, age );
	}
}
//----------------------------------------
class PersonTester {
	public static void main(String [] args) {
    	Person p1 = new Person ( "Jack", 10 );
    	Person p2 = new Person ( "Jack", 10 );
        Student s3 = new Student( "Jack", 10 );
 
        System.out.println ( " p1 == p2 " + ( p1 == p2 ) );
        System.out.println ( " p2 == p1 " + ( p2 == p1 ) );
        System.out.println ( " s3 == p1 " + ( s3 == p1 ) );
        System.out.println ( " p1.equals(p2) " + ( p1.equals(p2) ) );
        System.out.println ( " p2.equals(p1) " + ( p2.equals(p1) ) );
        System.out.println ( " s3.equals(p1) " + ( s3.equals(p1) ) );
        System.out.println ( " p2.equals(s3) " + ( p2.equals(s3) ) );
	}
