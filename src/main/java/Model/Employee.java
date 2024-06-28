/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author dell
 */
public class Employee {
    
  private String EMPID;
    private String EmployeeName;
    private String Title;
 
    

    public Employee(String EMPID, String EmployeeName, String Title) {
        this.EMPID = EMPID;
        this.EmployeeName = EmployeeName;
        this.Title = Title;
     
       
    }

    

    public String getWID() {
        return EMPID;
    }

    public void setWID(String WID) {
        this.EMPID = WID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getTitle() {
        return Title;
    }

    public void setCustomerID(String Title) {
        this.Title = Title;
    }





    @Override
    public String toString() {
        return "Employee{" + "EMPID=" + EMPID + ", CoustomerName=" + EmployeeName + ", Title=" + Title + '}';
    }

    
}
