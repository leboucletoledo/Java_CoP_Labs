import java.io.IOException;
import java.text.ParseException;

public class App {
    public static void main(String[] args) throws IOException, ParseException  {
        Test test = new Test();

        // Must have the throws with all exceptions from called class
        
        // A try with multiple catches
        try {
            test.run();    
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse command file.");
        }

        // or multi-catch

        try {
            test.run();    
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        
    }
}
