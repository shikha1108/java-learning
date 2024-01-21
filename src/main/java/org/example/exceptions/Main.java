package org.example.exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            printLength();
        } catch (Exception ex) {
            System.out.println("I am dying because of exception");
            throw ex;
        } finally {
            System.out.println("I will print this always");
        }
        System.out.println("bye");
    }

    private static void printLength() throws NullPointerException {
        String name = null;
        System.out.println(name.length());
        System.out.println("hello");
    }
}
