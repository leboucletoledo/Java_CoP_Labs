package demo2;

import java.io.File;
import java.io.FileReader;

public class App {

    public static void main(String[] args) {
        File file = new File("testt.txt");

        try {
            FileReader fr = new FileReader(file);
            System.out.println("File found, continuing...");
        } catch (Exception e) {
            System.out.println("File not found: " + file.toString());
        }

    }

}
