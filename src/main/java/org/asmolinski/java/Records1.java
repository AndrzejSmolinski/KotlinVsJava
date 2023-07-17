package org.asmolinski.java;

import java.util.UUID;

public class Records1 {

    public static void main(String[] args) {
        System.out.println(
                new Person1.Builder().build()
        );
        System.out.println(
                new Person1.Builder()
                        .withFirstName("Jane")
                        .build()
        );
        System.out.println(
                new Person1.Builder()
                        .withFirstName("Kate")
                        .withFirstName("Smith")
                        .withAge(40)
                        .build()
        );
    }

}

record Person1(
        String id,
        String firstName,
        String lastName,
        int age
) {
    static class Builder {
        private String id = UUID.randomUUID().toString();
        private String firstName = "John";
        private String lastName = "Doe";
        private int age = 20;

        Builder withId(String id) {
            this.id = id;
            return this;
        }

        Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        Builder withAge(int age) {
            this.age = age;
            return this;
        }

        Person1 build() {
            return new Person1(id, firstName, lastName, age);
        }
    }
}