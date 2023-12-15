//----------------------------------------
class Animal {
     // Avoid public data
    public static String sound = "ARGH";
    public String getSound() {
        return sound;
    }
}
//----------------------------------------
class Dog extends Animal {
     // Avoid public data
    public static String sound = "WOOF";
    public String getSound() {
        return sound;
    }
}
//----------------------------------------
class AnimalTester {
    public static void main (String [] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Dog d1 = new Dog();

        System.out.println ( Animal.sound );
        System.out.println ( Dog.sound );
        System.out.println ( "------------");
        System.out.println ( a1.sound );
        System.out.println ( a2.sound );
        System.out.println ( d1.sound );
        System.out.println ( "------------");
        System.out.println ( a1.getSound() );
        System.out.println ( a2.getSound() );
        System.out.println ( d1.getSound() );
    }
}
