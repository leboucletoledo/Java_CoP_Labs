public class App {
    public static void main(String[] args) {
        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("Bob");
        person1.greet();

        /*
         * What if both classes should have a common method that is show info? They are
         * unrelated...
         * Create interface
         */

        // you can only access the method pertinent to the info interface
        Info info1 = new Machine();
        info1.showInfo();

        // can also pinpoint to an already created object and access the specific method
        Info info2 = person1;
        info2.showInfo();

        outputInfo(mach1);
        outputInfo(person1);

    }

    private static void outputInfo(Info info) {
        info.showInfo();
    }
    }
