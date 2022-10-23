class Machine {
    public void start() {
        System.out.println("Starting machine...");
    }
}

interface Plant {
    public void grow();
}

public class App {
    public static void main(String[] args) {

        Machine machine1 = new Machine() {
            /*
             * Override a method
             * variable is declared as Machine, but is not an actual Machine object
             * it is a child class of Machine, but without name
             * This is an Anonymous Class
             */
            @Override
            public void start() {
                System.out.println("Camera starting...");
            }

        };
        machine1.start();

        // Can work with interfaces
        Plant plant1 = new Plant() {
            public void grow() {
                System.out.println("Plant growing...");
            }
        };

        // call method of an anonymous class that implements an interface
        plant1.grow();

    }
}
