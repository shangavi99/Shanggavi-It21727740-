package Model;



public class Allocate {

    private String EID;
    private String EmployeeName;
    private String JobID;

    public Allocate(String EID, String EmployeeName, String JobID) {
        this.EID = EID;
        this.EmployeeName = EmployeeName;
        this.JobID = JobID;
    }

    public String getEID() {
        return EID;
    }

    public void setEID(String EID) {
        this.EID = EID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getJobID() {
        return JobID;
    }

    public void setJob(String JobID) {
        this.JobID = JobID;
    }

}
