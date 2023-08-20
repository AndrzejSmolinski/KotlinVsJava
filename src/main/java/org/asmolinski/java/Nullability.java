package org.asmolinski.java;

public class Nullability {

    public static void main(String[] args) {
        System.out.println(stringFun().length());

        if (booleanFun()) {
            System.out.println("prawda");
        } else {
            System.out.println("fałsz");
        }
    }

    private static Boolean booleanFun() {
        return null;
    }

    private static String stringFun() {
        return null;
    }
}
