
public class branch {
    private String branchName;
    

    public branch(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return this.branchName;
    }

    public void printBranchName(){
        System.out.println("This is " + this.branchName);
        // System.out.println("It branch belongs to " + this.col);
    }
}