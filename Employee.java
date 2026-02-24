package com.shree.clssdef;

import java.util.Objects;

public class Employee {
    // Fields (instance variables)
    private String name;
    private double salary;
    private static int employeeCount = 0;  // class variable
    
    // Constructors
    public Employee() {
        this("Unknown", 0.0);
    }
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        employeeCount++;
    }
    
    // Methods
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    // Static method
    public static int getEmployeeCount() { return employeeCount; }
    
    // Override Object methods
    @Override
    public String toString() {
        return String.format("Employee{name='%s', salary=%.2f}", name, salary);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
               Objects.equals(name, employee.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}