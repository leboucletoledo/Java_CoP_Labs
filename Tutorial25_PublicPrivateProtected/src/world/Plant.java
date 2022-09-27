package world;

public class Plant {
    /*
     * Don't declare instance variables as public
     * Encapsulation is better; access through methods
     */
    public String name;

    /*
     * Use of constants with static and final
     * Better practice
     */
    public static final int ID = 7;

    /*
     * private is only access within Class
     */
    private String type;

    /*
     * protected can be accessed by child classes
     */
    protected String size;

    /*
     * No specified access means package level visibility
     * 
     */
    int height;

    public Plant() {
        this.name = "Jimmy";
        this.type = "The Plant";
        this.size = "medium";
        this.height = 8;
    }

}
