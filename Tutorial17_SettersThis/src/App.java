class Frog {
    // Enforce encapsulation with private
    private String name;
    private int age;

    // local variables mask instance variables
    // this refers to the instance variable
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getters don't necessarily need this, there is no other variable that masks
    // the instance ones
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }
}

public class App {
    public static void main(String[] args) {

        Frog frog1 = new Frog();

        // Can't use this anymore, the instance variables are private
        // frog1.name = "Bertie";
        // frog1.age = 1;

        // Encapsulation: hidding instance data from other classes
        frog1.setName("Bertie");
        frog1.setAge(1);

        System.out.println(frog1.getName());
        System.out.println(frog1.getAge());
    }
}
