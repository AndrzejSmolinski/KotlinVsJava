package org.asmolinski.java;

import java.util.Random;

sealed interface Season permits Spring, Summer, Autumn, Winter {
}

final class Spring implements Season {
    void blossom() {
        System.out.println("kwitnie");
    }
}

final class Summer implements Season {
    void heat() {
        System.out.println("upał");
    }
}

final class Autumn implements Season {
    void rain() {
        System.out.println("pada");
    }
}

final class Winter implements Season {
    void snow() {
        System.out.println("śnieg");
    }
}

class Sealed {

    public static void main(String[] args) {

        final var season = switch (new Random().nextInt(4)) {
            case 0 -> new Spring();
            case 1 -> new Summer();
            case 2 -> new Autumn();
            default -> new Winter();
        };

        // switch pattern matching - PREVIEW FEATURE
        switch (season) {
            case Spring spring -> spring.blossom();
            case Summer summer -> summer.heat();
            case Autumn autumn -> autumn.rain();
            case Winter winter -> winter.snow();
        }

        // This is what you actually get
        if (season instanceof Spring spring) {
            spring.blossom();
        } else if (season instanceof Summer summer) {
            summer.heat();
        } else if (season instanceof Autumn autumn) {
            autumn.rain();
        } else if (season instanceof Winter winter) {
            winter.snow();
        }

    }

}

