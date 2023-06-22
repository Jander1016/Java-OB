package com.poo.interfaces;

import java.util.List;

public interface EmployeeCRUD {

    void save(Employee employee);
    List<Employee> findAll();

}
