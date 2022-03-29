
public class audi implements car {
    @Override
    public void type() {
        System.out.println("Its type is sedan");
    }
    @Override
    public void noOfwheels() {
        System.out.println("Its no of wheels is 4");
    }
    @Override
    public void fuel() {
        System.out.println("Its fuel is petrol");
    }
}