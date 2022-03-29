
public abstract class Bird extends Animal{

    public Bird(String type) {
        super(type);
    }

    @Override
    public void height() {
        System.out.println("The height of the Bird is les");
    }    

    @Override
    public void weight() {
        System.out.println("The weight of the bird is less");
    }


    public void fly() {
        System.out.println("Birds fly high above in the sky");
    }
    
}