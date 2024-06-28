package Controller;



import Model.TTLoginUser;
import java.util.ArrayList;

public class LoginController {

    TTLoginUser LoginObj;
    ArrayList<TTLoginUser> LoginDB;
    
    public LoginController()
    {
        LoginDB = new ArrayList<>();
        LoginDB.add(new TTLoginUser("EMP","1234"));
        LoginDB.add(new TTLoginUser("EMP002","asd456"));
        LoginDB.add(new TTLoginUser("EMP003","zxc789"));
    }
    
    public TTLoginUser AddLoginUser(String EID, String Password)
    {
        LoginObj = new TTLoginUser(EID, Password);
        return LoginObj;
    }
    
    public TTLoginUser CheckUser(TTLoginUser LoginObj)
    {
        for(TTLoginUser Log:LoginDB)
        {
            if(LoginObj.getEID().equals(Log.getEID()) && LoginObj.getPassword().equals(Log.getPassword()))
            {
                return Log;
            }
        }
        return null;
    }
    
}
