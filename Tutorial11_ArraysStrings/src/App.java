public class App {
    public static void main(String[] args) {
        String[] words = new String[3];
        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";

        String[] fruits = { "apple", "banana", "pear", "kiwi" };
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        int value = 123; // Enough memory for holding an integer, primitive type
        String text = null;// Non-primitive type; String is a class; allocate memory for a reference to a string
        System.out.println(text);

        String[] texts = new String[2]; // Allocating enough memory for 2 references to 2 strings
        System.out.println((texts[0]));

        texts[0] = "one"; //Allocating memory to a string

        for (String text : texts) {
            System.out.printf("Array: %s%n", text);
        }

    }
}
