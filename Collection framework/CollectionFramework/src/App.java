import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Collection Framework");

        List<Integer> newList = new ArrayList<Integer>();
        newList.add(9);
        newList.add(8);
        newList.add(6);
        newList.add(4);
        newList.add(2);
        newList.add(1);
        newList.add(0);
        newList.add(6);
        newList.add(5);
        Collections.sort(newList);
        Iterator iter = newList.listIterator();
        System.out.println("After sorting the list");
        while (iter.hasNext()) {
            System.out.println("The value is " + iter.next());
        }

        int search = Collections.binarySearch(newList, 5);
        System.out.println("The searched element is at the index " + search);
    }
}
