public class App {
    public static void main(String[] args) {
        String info = "";

        // Inefficient since you are creating new strings and reassigning to a variable
        // info
        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";
        System.out.println(info);

        // Using StringBuilder modifies the content of the object, not creating new
        // ones; more efficient
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");
        System.out.println(sb.toString());

        // Chaining methods is possible (same or skip line), up until semi-colon
        // StringBuffer is used for multi-threaded applications, but can be used the
        // same
        // StringBuilder is lightweight
        StringBuilder s = new StringBuilder();
        s.append("My name is Roger.")
                .append(" ")
                .append("I am a skydiver.");
        System.out.println(s.toString());

        // Formatting integers and strings
        System.out.print("Here is some text.\tThat was a tab.\nThat was a newline");
        System.out.println(" More text.");
        System.out.printf("Total cost %-10d; quantity is %10d%n", 5, 120);
        for (int i = 0; i < 20; i++) {
            System.out.printf("%-2d: %s%n", i, "some text here");
        }

        // Formatting floating point values with decimals
        System.out.printf("Total value: %f%n", 5.6);
        System.out.printf("Total value: %.2f%n", 5.6987);
        System.out.printf("Total value: %10.1f%n", 5.3573);

    }
}
