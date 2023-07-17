package org.asmolinski.java;

import org.jetbrains.annotations.NotNull;

public class Nullability {

    public static void main(String[] args) {
        System.out.println(stringFun().length());

        if (booleanFun()) {
           System.out.println("prawda");
        }
    }

    private static Boolean booleanFun() {
        return null;
    }

    private static String stringFun() {
        return null;
    }
}
