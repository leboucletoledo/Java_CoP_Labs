class Robot {
    public void speak(String text) {
        System.out.println(text);
    }

    public void jump(int height) {
        System.out.println("Jumping: " + height);
    }

    // Declare the type for each parameter
    public void move(String direction, double distance) {
        System.out.printf("Moving %f meters in direction %s.%n", distance, direction);
    }
}

public class App {
    public static void main(String[] args) {
        Robot sam = new Robot();
        sam.speak("Hi I'm Sam.");
        sam.jump(7);
        sam.move("West", 12.2);

        String greeting = "Hello there.";
        sam.speak(greeting);
    }
}
