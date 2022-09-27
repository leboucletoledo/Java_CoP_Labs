// import whole packages or specific classes; wildcar is ocean.*
/* 
 * import whole packages or specific classes
 * wildcard is ocean.*
 * hierarchical use; packages can have packages
*/
import ocean.Fish;
import ocean.Seaweed;
import ocean.plants.Algae;

public class App {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Seaweed seaweed = new Seaweed();
        Algae algae = new Algae();

    }
}
