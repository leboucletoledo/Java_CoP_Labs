import java.util.Set;

/*
 * With abstract, you can't instantiate Machine objects,
 * just a child class
 */
public abstract class Machine {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void start();

    public abstract void doStuff();

    public abstract void shutdown();

    public void run() {
        start();
        doStuff();
        shutdown();
    }

}
