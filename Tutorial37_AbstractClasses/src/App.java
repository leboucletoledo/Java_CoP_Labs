public class App {
    public static void main(String[] args) {

        Camera cam1 = new Camera();

        cam1.setId(5);

        Car car1 = new Car();
        car1.setId(4);

        /*
         * Prevent instantiation of a base class (Machine) with abstract
         * It has no need except to serve as common parent class
         * It can include abstract methods; similar to interface
         */

         cam1.run();
         car1.run();
    }
}
