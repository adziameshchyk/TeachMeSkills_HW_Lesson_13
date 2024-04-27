package com.tms.features_of_working_with_java8_part1.additional_tasks.patterns.singletone;

/**
 * Task:
 *
 * Implement an example of a singleton pattern (this is just an example with a private constructor).
 */

public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
