
public class automobile {
    private String type;
    private String size;
    private String fuel;

    public automobile() {
        this("4Wheeler", "Big", "Petrol");
        System.out.println("Default constructor called!");
    }

    public automobile(String type, String size, String fuel) {
          this.type = type;
          this.size = size;
          this.fuel = fuel;
          System.out.println("Automobile.Parameterized construcctor called");
    }

}