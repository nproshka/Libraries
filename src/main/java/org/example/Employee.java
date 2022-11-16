package org.example;

import java.util.Objects;

public class Employee {

    private String fullName;
    private int dept;
    private int salary;
    private static int id;

    public int getId () {
        id++;
        return id;
    }

    public Employee(String name, int dept, int salary) {
        this.fullName = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return getFullName() + "(id:" + getId() + ")" + " работает в отделе №: "
                + getDept() + " и имеет зарплату " + getSalary() + " рублей";
    }

}
