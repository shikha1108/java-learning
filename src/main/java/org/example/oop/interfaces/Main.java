package org.example.oop.interfaces;

public class Main {
    public static void main(String[] args) {
        Person person = new Student();
        printName(person);

        Person teacher = new Teacher();
        printName(teacher);

        Employee teacher1 = new Teacher();
        printSalary(teacher1);

        Employee clerk = new Clerk();
        printSalary(clerk);

    }

    public static void printName(Person person) {
        System.out.println(person.getName());

    }

    public static void printSalary(Employee employee) {
        System.out.println(employee.getSalary());
    }

}
