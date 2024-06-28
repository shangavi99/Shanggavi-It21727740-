
package Controller;

import Model.Watch;

public class WatchController {

    Watch WatchObj;

    public Watch addWatch(String WID, String CoustomerName, String CustomerID, String CustomerMail) {
        WatchObj = new Watch(WID, CoustomerName, CustomerID,CustomerMail);
        return WatchObj;
    }
}
