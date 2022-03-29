public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Interfaces");
        car newCar;
        newCar = new audi();
        newCar.type();
        newCar.fuel();
        newCar.noOfwheels();

        car newCar2;
        newCar2 = new bmw();
        newCar2.type();
        newCar2.fuel();
        newCar2.noOfwheels();
    }
}
