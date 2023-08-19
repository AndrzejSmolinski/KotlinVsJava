package org.asmolinski.java;

public class Records {

    public static void main(String[] args) {
        final var person = new Person("Andrzej", "Smoliński", 33);
        final var person1 = new Person("Andrzej", "Smoliński", 33);
        System.out.println("firstName: " + person.firstName());
        System.out.println("lastName: " + person.lastName());
        System.out.println("age: " + person.age());
        System.out.println("equals: " + person.equals(person1));
        System.out.println("ref eq: " + (person == person1));
        System.out.println(person);
    }

}

record Person(String firstName, String lastName, int age) {}
