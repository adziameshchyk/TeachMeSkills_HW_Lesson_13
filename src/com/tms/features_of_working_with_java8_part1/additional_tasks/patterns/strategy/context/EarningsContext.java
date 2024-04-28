package com.tms.features_of_working_with_java8_part1.additional_tasks.patterns.strategy.context;

import com.tms.features_of_working_with_java8_part1.additional_tasks.patterns.strategy.strategies.EarningsStrategy;

public class EarningsContext {

    private EarningsStrategy strategy;

    public void setStrategy(EarningsStrategy strategy) {
        this.strategy = strategy;
    }

    public void makeMoney() {
        this.strategy.makeMoney();
    }
}
