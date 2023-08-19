package org.asmolinski.java;

public class ExtensionsJava {

    public static void main(String[] args) {
        // static util
        System.out.println(StringUtils.isPalindrome("kajak"));
        System.out.println(StringUtils.isPalindrome("łódka"));

        // wrapper type
        System.out.println(new StringWrapper("kajak").isPalindrome());
        System.out.println(new StringWrapper("łódka").isPalindrome());
    }

}

class StringUtils {
    static boolean isPalindrome(String input) {
        return input.contentEquals(new StringBuilder(input).reverse());
    }
}

class StringWrapper {
    private final String wrapped;

    StringWrapper(String wrapped) {
        this.wrapped = wrapped;
    }

    boolean isPalindrome() {
        return wrapped.contentEquals(new StringBuilder(wrapped).reverse());
    }
}
