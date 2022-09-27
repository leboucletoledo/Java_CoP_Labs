class Thing {
    /*
     * Static member variables belong to the class (class variables)
     * Only one copy
     */
    public String name;
    public static String description;

    // Using final locks the class variable, not allowing any changes to it
    public static final int LUCKY_NUMBER = 7;
    public static int count = 0;

    // Object id variable
    public int id = 0;

    // Constructor for keeping count and assigning id
    public Thing() {
        id = count;
        count++;
    }

    public void showName() {
        System.out.println("Object id: " + id + ", " + description + ": " + name);
    }

    /*
     * Same applies to class methods, using static
     * Static methods can access static data that belongs to the class
     * They can't access instance data
     */
    public static void showInfo() {
        System.out.println("Hello");
        // System.out.println(name); -----> This won't work
    }
}

public class App {
    public static void main(String[] args) {

        // Static (class) variable
        System.out.println("Before object creation: " + Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        // Static (class) variable
        Thing.description = "I am a thing";
        System.out.println(Thing.description);
        System.out.println("After object creation: " + Thing.count);

        // Static (class) method call
        Thing.showInfo();

        // Instance (object) variable
        thing1.name = "Bob";
        thing2.name = "Sue";

        // Instance method call
        thing1.showName();
        thing2.showName();

        /*
         * Static uses:
         * - Create a constant
         * - Count the number of objects you have created using a constructor
         * - Create object id
         */

        System.out.println(Math.PI);
        System.out.println(Thing.LUCKY_NUMBER);

    }
}
