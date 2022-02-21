package com.utkarsh.mngres.Service;
import java.util.List;

import com.utkarsh.mngres.Model.Employee;

public interface EmployeeService {
    List<Employee> getEmployees();
    Employee findByEmployeeCode(String employeeCode);
    void deleteByEmployeeCode(String employeeCode);
    Employee updateEmployee(String employeeCode);
}
