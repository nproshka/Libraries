package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class Employee {

    private String firstName;
    private String middleName;
    private String lastName;
    private int dept;
    private int salary;
    private final int id;
    private static int counter;

    public Employee(String lastName, String firstName, String middleName, int dept, int salary) {
        setLastName(lastName);
        setFirstName(firstName);
        setMiddleName(middleName);
        this.dept = dept;
        this.salary = salary;
        this.id = counter++;
    }

    public int getId () {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setLastName(String lastName) {
        if (lastName == null || StringUtils.isAllBlank(lastName) || StringUtils.isAllEmpty(lastName) || StringUtils.containsAny(lastName, "1234567890") || StringUtils.containsAny(lastName, "=_:?%;№!-+)(*&^%$#")) {
            throw new IllegalArgumentException("400 Bad Request");
        } else {
            this.lastName = StringUtils.substring(lastName, 0, 1).toUpperCase() + StringUtils.substring(lastName, 1);
        }
    }

    public void setFirstName(String firstName) {
        if (firstName == null || StringUtils.isAllBlank(firstName) || StringUtils.isAllEmpty(firstName) || StringUtils.containsAny(firstName, "1234567890") || StringUtils.containsAny(firstName, "=_:?%;№!-+)(*&^%$#")) {
            throw new IllegalArgumentException("400 Bad Request");
        } else {
            this.firstName = StringUtils.substring(firstName, 0, 1).toUpperCase() + StringUtils.substring(firstName, 1);
        }
    }

    public void setMiddleName(String middleName) {
        if (middleName == null || StringUtils.isAllBlank(middleName) || StringUtils.isAllEmpty(middleName) || StringUtils.containsAny(middleName, "1234567890") || StringUtils.containsAny(middleName, "=_:?%;№!-+)(*&^%$#")) {
            throw new IllegalArgumentException("400 Bad Request");
        } else {
            this.middleName = StringUtils.substring(middleName, 0, 1).toUpperCase() + StringUtils.substring(middleName, 1);
        }
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
        return getLastName() + " " + getFirstName() + " " + getMiddleName() + "(id:" + getId() + ")" + " работает в отделе №: "
                + getDept() + " и имеет зарплату " + getSalary() + " рублей";
    }

}
