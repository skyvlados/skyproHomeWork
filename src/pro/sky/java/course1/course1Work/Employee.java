package pro.sky.java.course1.course1Work;

import java.util.Objects;

public class Employee {
    private static int counter;

    private final String name;
    private final int id;
    private int department;
    private double salary;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment() {
        this.department = department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary() {
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Сотрудник id" + id + ": " + name + "; отдел: " + department + "; зарплата: " + salary;
    }
}
