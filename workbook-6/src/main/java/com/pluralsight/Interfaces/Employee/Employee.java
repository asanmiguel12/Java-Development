package com.pluralsight.Interfaces.Employee;

public abstract class Employee {
    private String name;
    private String id;
    private double salary;

   public abstract void work();

   public abstract void getSalary();
}
