package com.tms.features_of_working_with_java8_part1.mandatory_tasks.task_2.models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SomeLogic {

    private static final SomeLogicFunction<String> reverse = s -> new StringBuilder(s).reverse().toString();
    private static final SomeLogicFunction<Integer> computeFactorial =
            i -> i <= 0 ? 1 : i * SomeLogic.computeFactorial.execute(--i);

    public  static void execute(int action) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            if (action == 1) {
                System.out.print("Enter the line for reverse: ");
                String line = reader.readLine();
                System.out.println("Reverse line: " + reverse.execute(line));
            } else if (action == 2) {
                System.out.print("Enter a number to compute the factorial: ");
                int number = Integer.parseInt(reader.readLine());
                int factorial = computeFactorial.execute(number);
                System.out.println("The factorial of " + number +  " is: " + factorial);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}
