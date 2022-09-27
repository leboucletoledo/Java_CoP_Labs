class Frog {

    private String name;
    private int id;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Invokes string representation from the object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append("name");
        return sb.toString();
    }
}

class FrogNoString {
    // if no toString() method, you get Class and hashcode (id for object)
}

public class App {
    public static void main(String[] args) {
        Frog frog1 = new Frog(7, "Rick");
        Frog frog2 = new Frog(5, "Mel");
        System.out.println(frog1);
        System.out.println(frog2);

        FrogNoString frog3 = new FrogNoString();
        System.out.println(frog3);
    }
}
