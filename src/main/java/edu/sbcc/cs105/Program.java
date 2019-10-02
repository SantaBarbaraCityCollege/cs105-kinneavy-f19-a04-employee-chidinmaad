// Replace all code in this file with what is provided in the assignment
package edu.sbcc.cs105;

public class Program {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Chidinma", 10000);
        System.out.println(employee1.getName());
        System.out.println(employee1.getSalary());
        employee1.raiseSalary(0.01);
        

    }

}