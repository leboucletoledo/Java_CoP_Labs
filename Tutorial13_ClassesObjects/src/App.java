class Person {
    /*
     * Classes can contain:
     * 1. Data (instance variables)
     * 2. Methods
     */
    String name;
    int age;

}

public class App {
    public static void main(String[] args) {
        // This is the main method
        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.age = 37;

        Person person2 = new Person(); // declaring a new Person object to variable "person2" of type Person
        person2.name = "Sarah Smith";
        person2.age = 20;

        System.out.println(person1.name);
    }
}
