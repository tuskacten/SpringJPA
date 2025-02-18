package com.example.demoJPA.service;
import java.util.ArrayList;
import com.example.demoJPA.modal.Employee;
public interface EmpService {
    ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    void addEmployee();
    void deleteAllData();
}
