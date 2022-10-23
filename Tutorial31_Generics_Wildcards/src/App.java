import java.util.ArrayList;

class Machine {

    @Override
    public String toString() {
        return "I am a machine";
    }

    public void start(){
        System.out.println("Machine starting");
    }

}

class Camera extends Machine {

    @Override
    public String toString() {
        return "I am a camera";
    }

    public void snap() {
        System.out.println("Snapping");
    }

}

public class App {
    public static void main(String[] args) {

        ArrayList<Machine> list1 = new ArrayList<>();
        list1.add(new Machine());
        list1.add(new Machine());
        showList(list1);

        // ArrayList<Camera> does not extend ArrayList<Machine>
        ArrayList<Camera> list2 = new ArrayList<>();
        list2.add(new Camera());
        list2.add(new Camera());
        showListWildcard(list2);

    }

    public static void showList(ArrayList<Machine> list) {
        for (Machine value : list) {
            System.out.println(value);
        }
    }

    // Use instead Wildcard ?, upper bound is also available with extend
    public static void showListWildcard(ArrayList<? extends Machine> list) {
        for (Machine value : list) {
            System.out.println(value);
            value.start();
        }
    }

    // lower bound with super
    public static void showListWildcard2(ArrayList<? super Camera> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }
}
