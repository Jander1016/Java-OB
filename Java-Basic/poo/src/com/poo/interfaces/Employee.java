package com.poo.interfaces;

public class Employee {
    String name;
    int age;
    double salary;
    boolean isActive;

    public Employee() {
    }

    public Employee(String name, int age, double salary, boolean isActive) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", isActive=" + isActive +
                '}';
    }
}
