public class App {
    public static void main(String[] args) {
        Machine mach1 = new Machine();
        mach1.start();
        mach1.stop();

        // Methods are inherited from Object class by default
        // By using inheritance, the methods from parent class can be used
        Car car1 = new Car();
        car1.start();
        car1.wipeWindShield();
        car1.stop();
        car1.showInfo();

    }
}
