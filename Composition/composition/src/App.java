public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Composition");

        branch branchObj = new branch("CSE");
        college colObj = new college("MCE", branchObj);        
        university uniObj = new university("VTU",1,colObj);

        uniObj.getCol().getBr().printBranchName();

        


    }
}
