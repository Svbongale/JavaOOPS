
public class university {
    private String uniName;
    private int uniNo; 
    private college col;   


    public university(String uniName, int uniNo, college col) {
        this.uniName = uniName;
        this.uniNo = uniNo;
        this.col = col;
    }


    public college getCol() {
        return this.col;
    }

    public String getUniName() {
        return this.uniName;
    }

  
    public int getUniNo() {
        return this.uniNo;
    }

}