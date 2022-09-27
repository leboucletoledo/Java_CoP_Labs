import world.Plant;

public class App {
    public static void main(String[] args) {

        Plant plant = new Plant();
        System.out.println(plant.name);
        System.out.println(plant.ID);

        /*
         * Can't access private variables
         */

        /*
         * size is protected; App is not in same package as Plant
         * access to plant.size won't work here
         * same with plant.height; different packages restrict it
         */

    }
}
