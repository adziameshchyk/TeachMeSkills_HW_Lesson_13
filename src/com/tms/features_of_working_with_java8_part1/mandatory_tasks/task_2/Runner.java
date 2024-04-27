package com.tms.features_of_working_with_java8_part1.mandatory_tasks.task_2;

import com.tms.features_of_working_with_java8_part1.mandatory_tasks.task_2.models.SomeLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Task:
 *
 * Create a generalized functional interface.
 * Write a class with one method (think and justify the decision about whether it will be a static method or not).
 * In this method, implement the logic:
 * if the number 1 is entered into the console, then:
 *  use an interface with a string type and pass the line reversal logic (outputting the line in reverse order) to the interface method.
 * if the number 2 is entered into the console, then:
 *  use an interface with an integer type and pass the logic for finding the factorial of the number to the interface method.
 */

public class Runner {

    public static void main(String[] args) {
        int action;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please, select action:\n\treverse line - enter \"1\".\n\tfactorial of a number - enter \"2\".");

            action = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        SomeLogic.execute(action);
    }

}
