package Model;



public class TTLoginUser {

    private String EID;
    private String Password;

    public TTLoginUser(String EID, String Password) {
        this.EID = EID;
        this.Password = Password;
    }

    public String getEID() {
        return EID;
    }

    public void setEID(String EID) {
        this.EID = EID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
