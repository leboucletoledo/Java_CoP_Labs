public class App {
    public static void main(String[] args) {
        /*
         * Two basic kind of exceptions in Jave
         * Checked: forced to handle
         * Runtime: not forced to handle (dividing by zero)
         */

        // This compiles, but throws a runtime exception
        // int value = 7;
        // value = value / 0;

        // initialized, but no object; it will compile
        // String text = null;
        // System.out.println(text.length());

        /*
         * still can use try catch with runtime exceptions
         * not recommended since runtime exceptions mean there is something
         * fundamentally off with the code
         */
        String[] texts = { "one", "two", "three" };
        try {
            System.out.println(texts[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

    }
}
