package com.tms.features_of_working_with_java8_part1.mandatory_tasks.task_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Task:
 *
 * Get the day of the week by date.
 */

public class Runner {

    public static void main(String[] args) {
        int day;
        int month;
        int year;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Please enter day: ");
            day = Integer.parseInt(reader.readLine());

            System.out.print("Please enter month: ");
            month = Integer.parseInt(reader.readLine());

            System.out.print("Please enter year: ");
            year = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.getDayOfWeek().toString().toLowerCase());
    }


}
