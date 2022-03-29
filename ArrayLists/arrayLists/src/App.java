import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Array Lists.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to add");
        String str = sc.nextLine();

        // create object of StringList class

        StringList list = new StringList();
        list.addStrings(str);
        System.out.println("Added " + str +" successfully");
        System.out.println("The added string is");
        list.getStrings();
        
    }
}
