package com.tms.features_of_working_with_java8_part1.additional_tasks.patterns.immutable_object;

import java.util.ArrayList;
import java.util.List;

/**
 * Task:
 *
 * Implement an example of the immutable object pattern (this is what we discussed when we wanted to use our custom object as a key in a hash map).
 */

public class ImmutableObject {

    private final int intValue;
    private final String stringValue;
    private final ArrayList<String> listValue;

    public ImmutableObject(int intValue, String stringValue, List<String> listValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
        this.listValue = new ArrayList<>();
        this.listValue.addAll(listValue);
    }

    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public List<String> getListValue() {
        return (List<String>) listValue.clone();
    }
}