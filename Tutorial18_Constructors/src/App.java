class Machine {
    private String name;
    private int code;

    /*
     * Constructor: method that is run everytime a new object is created
     * Has to be public, does not need any return type. Name is the same of the
     * class.
     * It can contain parameters.
     * More than one constructor can be included
     */
    public Machine() {
        /* 
        To invoke a constructor within a constructor, use this
        It must be called as the first statement
        */ 
        this("Arnie", 0);
        System.out.println("Constructor running!");
        name = "Arnie";
        
    }

    // Java will detect which constructor to use depending on the parameters used
    public Machine(String name) {
        System.out.println("Second constructor running!");
        this.name = name;
    }

    public Machine(String name, int code) {
        System.out.println("Third constructor running!");
        this.name = name;
        this.code = code;
    }
}

public class App {
    public static void main(String[] args) {
        Machine machine1 = new Machine();

        // Note: no need to assign to a variable the new object
        new Machine();

        Machine machine2 = new Machine("Bertie");
        Machine machine3 = new Machine("Chalky", 7);

    }
}
