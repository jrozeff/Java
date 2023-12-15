class LittleKitty {

}
//----------------------------------------
class MainTester {
    public static void main(String [] args) {
        System.out.println ( "In MainTester main... " );
        //printArgs(args);

        LittleKitty boo = new LittleKitty();
        System.out.println ( boo );

        //doSomething();
    }
    
    public static void printArgs (String [] args) {
        for (int i = 0 ; i < args.length ; i++ ) {
            System.out.println ( args [i] );
        }
    }

    public void doSomething () {
        System.out.println( "doing something " );
    }
}