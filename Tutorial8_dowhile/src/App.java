import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /* Instead of repeating yourself with a while loop... */
        // System.out.println("Enter a number: ");
        // int value = scanner.nextInt();

        // while(value != 5){
        //     System.out.println("Not 5; try again: ");
        //     value = scanner.nextInt();
        // }

        int value = 0; // due to variable scope, it has to be declared outside
        do {
            System.out.println("Enter a number: ");
            value = scanner.nextInt();
        }
        while(value!=5);
        System.out.println("Got 5!");
    }
}
