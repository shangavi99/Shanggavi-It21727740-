
package Model;

public class Watch {

    private String WID;
    private String CoustomerName;
    private String CustomerID;
    private String CustomerMail;
    

    public Watch(String WID, String CoustomerName, String CustomerID, String CustomerMail) {
        this.WID = WID;
        this.CoustomerName = CoustomerName;
        this.CustomerID = CustomerID;
        this.CustomerMail = CustomerMail;
       
    }

    

    public String getWID() {
        return WID;
    }

    public void setWID(String WID) {
        this.WID = WID;
    }

    public String getCoustomerName() {
        return CoustomerName;
    }

    public void setCoustomerName(String CoustomerName) {
        this.CoustomerName = CoustomerName;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCustomerMail() {
        return CustomerMail;
    }

    public void setCustomerMail(String CustomerMail) {
        this.CustomerMail = CustomerMail;
    }



    @Override
    public String toString() {
        return "Watch{" + "WID=" + WID + ", CoustomerName=" + CoustomerName + ", CustomerID=" + CustomerID + '}';
    }

    
}
