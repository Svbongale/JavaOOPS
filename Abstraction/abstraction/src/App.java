public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Abstraction");
        Elephant elephant = new Elephant("Type is elephant");
        sparrow sprr = new sparrow("Type is sparrow");

        elephant.height();
        elephant.weight();

        sprr.height();
        sprr.weight();
        sprr.fly();
    }
}
