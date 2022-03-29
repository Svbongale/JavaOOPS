
public class car extends automobile{
    private String brand;
    private String name;
    private int no_of_wheels;    

    public car(String type, String size, String fuel, String brand, String name, int no_of_wheels) {
        super(type, size, fuel);
        this.brand = brand;
        this.name = name;
        this.no_of_wheels = no_of_wheels;
        System.out.println("extended constructor called");
    }

}