package org.example;

public class EmployeeService {

    public static void viewEmployees (Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static void viewFullNameEmployees (Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
    public static void calculateSalarySum (Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц " + sum + " рублей.");
    }
    public static void findPersonWithMaxSalary (Employee[] employees) {
        int max = Integer.MIN_VALUE;
        String name = null;
        for (Employee employee : employees) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                name = employee.getFullName();
            }
        }
        System.out.println(name + " имеет самую высокую зарплату в размере " + max + " рублей.");
    }
    public static void findPersonWithMinSalary (Employee[] employees) {
        int min = Integer.MAX_VALUE;
        String name = null;
        for (Employee employee : employees) {
            if (employee.getSalary() < min) {
                min = employee.getSalary();
                name = employee.getFullName();
            }
        }
        System.out.println(name + " имеет самую низкую зарплату в размере " + min + " рублей.");
    }
    public static void calculateSalaryArray (Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        sum = sum / employees.length;
        System.out.println("Среднее значение зарплат за месяц " + sum + " рублей.");
    }

}
