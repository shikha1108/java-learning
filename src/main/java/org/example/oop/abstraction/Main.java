package org.example.oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Person person = new Student();
        printName(person);
    }
    public static void printName(Person person) {
        System.out.println(person.getName());
    }
}
