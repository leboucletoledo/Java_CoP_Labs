import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "example.txt";

        File textFile = new File(fileName);

        Scanner in = new Scanner(textFile);

        int value = in.nextInt();
        System.out.println("Int value: " + value);

        // to account for skip line
        in.nextLine();

        int count = 2;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(count + ": " + line);
            count++;
        }
        in.close();

    }
}
