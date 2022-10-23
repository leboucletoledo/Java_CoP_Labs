import java.util.ArrayList;
import java.util.HashMap;

class Animal{

}

public class App {

    public static void main(String[] args) {
        /*
        * Generic class that works with other objects
        */

        // Before Java 5
        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String) list.get(1); // had to use downcast
        System.out.println(fruit);

        // After Java 5
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(2);
        System.out.println(animal);

        // More than one type of argument
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // Java 7; no need to re-speicfy the type
        ArrayList<Animal> someList = new ArrayList<>();
        
    }
}