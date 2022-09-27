public class App {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Tree tree1 = new Tree();

        /*
         * Runs the type of object
         */
        Plant plant2 = tree1;
        plant1.grow();
        plant2.grow();
        tree1.shedLeaves();

        /*
         * Can't run plant2.shedLeaves method on plant2,
         * despite referencing a Tree object
         * When calling a method, the type of reference is what matters
         */

        doGrow(tree1);
    }

    public static void doGrow(Plant plant) {
        /*
         * Polymorphism guarantees that it will run the method
         * from child class
         */
        plant.grow();
    }
}
