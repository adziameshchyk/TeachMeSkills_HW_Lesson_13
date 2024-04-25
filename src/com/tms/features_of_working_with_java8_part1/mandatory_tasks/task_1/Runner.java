package com.tms.features_of_working_with_java8_part1.mandatory_tasks.task_1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Task:
 *
 * Get the date of next Tuesday.
 */

public class Runner {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        TemporalAdjuster nextTuesday = TemporalAdjusters.next(DayOfWeek.TUESDAY);
        System.out.println("The date of next Tuesday is: " + now.with(nextTuesday));
    }

}
