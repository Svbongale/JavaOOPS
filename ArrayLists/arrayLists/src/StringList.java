import java.util.ArrayList;
public class StringList {
    
    private ArrayList<String> Stringlist = new ArrayList<String>();

    public void addStrings(String str){
        Stringlist.add(str);
    }

    public void getStrings() {
        System.out.println("There are " + Stringlist.size() + " strings");
        for(int i =0;i<Stringlist.size();i++){
            System.out.println("Item index  " + i + ": " + Stringlist.get(i));
        }
    }

//     public void removeStrings(int pos){
//         String str = Stringlist.get(pos);
//         StringList.remove(pos);
//     }
}