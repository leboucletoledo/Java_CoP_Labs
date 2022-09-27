package world;

public class Oak extends Plant {

    public Oak() {

        /*
         * Can't access private variables from parent class
         * this.type won't work
         */

        /*
         * Accessing a protected variable from parent class
         * accessing this.height is possible; same package
         */
        this.size = "large";
        this.height = 10;
    }

}
