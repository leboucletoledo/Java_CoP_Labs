class Machine {
    public void start() {
        System.out.println("Machine started.");
    }
}

class Camera extends Machine {
    public void start() {
        System.out.println("Camera started.");
    }

    public void snap() {
        System.out.println("Photo taken.");
    }
}

public class App {
    public static void main(String[] args) {

        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        /*
         * Upcasting
         * machine2 is referring to camera1 object
         * The variable decides which methods can be called for a variable type
         * Can't call machine2.snap() even if it is referring to a camera
         * Upcasting is safe and guaranteed by polymorphism
         */
        Machine machine2 = camera1;
        machine2.start();

        /*
         * Downcasting
         * force the downcasting with the variable type in parentheses
         * now .snap method can be accessed
         * downcasting is inherently unsafe
         */

        Machine machine3 = new Camera();
        Camera camera2 = (Camera) machine3;
        camera2.start();
        camera2.snap();

        // Can't transform from Machine type to Camera type; exceptions raised
        // Machine machine4 = new Machine();
        // Camera camera3 = (Camera) machine4;
        // camera3.start();
        // camera3.snap();

    }
}
