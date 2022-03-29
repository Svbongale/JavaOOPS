
public class college {
    private String colName;
    private branch br;    

    public college(String colName, branch br) {
        this.colName = colName;
        this.br = br;
    }

    public branch getBr() {
        return this.br;
    }

    public String getColName() {
        return this.colName;
    }

}