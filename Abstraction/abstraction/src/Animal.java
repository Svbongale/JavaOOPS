
public abstract class Animal {
    private String type;

    public Animal(String type) {
        this.type = type;
    }

    public abstract void height();
    public abstract void weight();

    public String getType() {
        return type;
    }

    
}