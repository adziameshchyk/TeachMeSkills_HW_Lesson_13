package com.tms.features_of_working_with_java8_part1.additional_tasks.patterns.strategy.strategies;

public class InvestInCryptocurrency implements EarningsStrategy {

    @Override
    public void makeMoney() {
        System.out.println("Earn income from cryptocurrency trading.");
    }

}
