package com.poo.interfaces;

import java.util.ArrayList;
import java.util.List;

public class CrudEmployee implements EmployeeCRUD {

    List<Employee> employeeList = new ArrayList<>();

    @Override
    public void save(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeList;
    }
}

