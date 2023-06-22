package com.poo.interfaces;

import java.util.List;

public class Main {
    static CrudEmployee employeeCRUD = new CrudEmployee();

    public static void main(String[] args) {
        Employee pepito = new Employee("pepito",23,1230, true);
        Employee juanita = new Employee("Juana",32,2390, true);
        Employee luis = new Employee("Luis",29,1990, true);

        //save employee
        employeeCRUD.save(pepito);
        employeeCRUD.save(juanita);
        employeeCRUD.save(luis);

        //List of employees
        List<Employee> employees = employeeCRUD.findAll();
        System.out.println(employees);
    }
}
