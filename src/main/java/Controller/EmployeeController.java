/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Employee;

/**
 *
 * @author dell
 */
public class EmployeeController {
    Employee EmployeeObj;
    
        public Employee addEmployee(String EMPID, String EmployeeName, String Title) {
        EmployeeObj = new Employee(EMPID, EmployeeName, Title);
        return EmployeeObj;
    }
}
