public class App {
    public static void main(String[] args) {

        int value = 7; // value variable

        int[] values; // reference variable
        values = new int[3]; //allocate memory to hold 3 integers
        
        System.out.println(values[0]);

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;
        
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        // Iterate through array values
        for(int i=0; i<values.length; i++) {
            System.out.println(values[i]);
        }

        int[] numbers = {5, 6, 7};
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
