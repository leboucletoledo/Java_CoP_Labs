class Person {

    String name;
    int age;

    // Method not returning anything
    void speak() {
        System.out.printf("My name is %s%n", name);
    }

    // Method returning an int value
    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;
        return yearsLeft;
    }

    // Get method
    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

}

public class App {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.name = "Joe";
        person1.age = 25;
        person1.speak();
        int years = person1.calculateYearsToRetirement();
        System.out.printf("Years till retirement: %d%n", years);

        int age = person1.getAge();
        String name = person1.getName();

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);


    }
}
