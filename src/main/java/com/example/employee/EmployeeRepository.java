// Write your code here
package com.example.employee;

import com.example.employee.Employee;
import java.util.*;

public interface EmployeeRepository {
    ArrayList<Employee> getEmployees();
    Employee getEmployeeById(int empId);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee, int empId);

    void deleteEmployee(int empId);
}