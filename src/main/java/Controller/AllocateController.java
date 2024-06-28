package Controller;



import Model.Allocate;

public class AllocateController {

    Allocate EmployeeObj;

    public Allocate addWatch(String EID, String EmployeeName,  String JobID) {
        EmployeeObj = new Allocate(EID, EmployeeName, JobID);
        return EmployeeObj;
    }
}
