package com.tms.features_of_working_with_java8_part1.mandatory_tasks.task_2.models;

@FunctionalInterface
public interface SomeLogicFunction<T> {

    T execute(T t);

}
