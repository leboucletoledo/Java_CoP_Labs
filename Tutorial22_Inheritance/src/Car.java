// extends means that Car is child class from Machine, so it inherits from the parent class
public class Car extends Machine {

    // Overriding a parent class's method
    @Override // Annotation that confirms that it is an actual override
    public void start() {
        System.out.println("Car started!");
    }

    public void wipeWindShield() {
        System.out.println("Wiping windshield");
    }

    // Cannot access private variables from parent class
    public void showInfo() {
        System.out.printf("Car name: %s", name_pub);
    }

}
