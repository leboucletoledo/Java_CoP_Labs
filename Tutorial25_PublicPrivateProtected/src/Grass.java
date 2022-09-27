import world.Plant;

public class Grass extends Plant {

    public Grass() {

        /*
         * Even if grass is a child class from plant; height is not visible
         * different packages don't allow for access to height
         */
        // System.out.println(this.height);

        /*
         * this.size is possible because it is a protected class
         * allows for access in child classes
         */
        System.out.println(this.size);
    }

}
