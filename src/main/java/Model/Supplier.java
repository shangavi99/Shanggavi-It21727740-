package Model;



public class Supplier {

    private String SID;
    private String SupplierName;
    private String Item;

    public Supplier(String SID, String SupplierName, String Item) {
        this.SID = SID;
        this.SupplierName = SupplierName;
        this.Item = Item;
    }

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getCoustomerName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String Item) {
        this.Item = Item;
    }

    @Override
    public String toString() {
        return "" + "SupplierID=" + this.SID + ", SupplierName=" + this.SupplierName + ", Item=" + this.Item + "";
    }

}
