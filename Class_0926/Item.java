import java.util.Arrays;

//----------------------------------------
class Item implements Comparable {
    private String name;
    private int id;

    public Item ( String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public int compareTo (Object otherObject) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;

        if ( otherObject == null ) {
            return BEFORE;
        }

        if (this == otherObject) return EQUAL;

        Item other = (Item) otherObject;
        int comparison = name.compareTo(other.name);
        if (comparison != EQUAL) {
            return comparison;
        }

        if (this.id > other.id) return AFTER;
        if (this.id < other.id) return BEFORE;

        return EQUAL;
    }
    @Override
    public String toString() {
        return this.name + " " + this.id;
    }
}

//----------------------------------------
class ItemTester {
    public static void main(String [] args) {
        Item item1 = new Item ( "x", 1 );
        Item item2 = new Item ( "y", 5);
        Item item3 = new Item ( "z", 4);
        Item item4 = new Item ( "a", 2);
        Item item5 = new Item ( "b", 3);

        Item [] items = { item1, item2, item3, item4, item5 };

        System.out.println ( "PRE-SORT : " + Arrays.toString ( items ) );
        Arrays.sort ( items );
        System.out.printf ( "POST-SORT: %s ", Arrays.toString ( items ) );
    }
}
//----------------------------------------