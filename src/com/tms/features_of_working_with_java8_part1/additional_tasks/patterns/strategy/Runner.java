package com.tms.features_of_working_with_java8_part1.additional_tasks.patterns.strategy;

import com.tms.features_of_working_with_java8_part1.additional_tasks.patterns.strategy.context.EarningsContext;
import com.tms.features_of_working_with_java8_part1.additional_tasks.patterns.strategy.strategies.EarningsStrategy;
import com.tms.features_of_working_with_java8_part1.additional_tasks.patterns.strategy.strategies.GetJob;
import com.tms.features_of_working_with_java8_part1.additional_tasks.patterns.strategy.strategies.InvestInCryptocurrency;
import com.tms.features_of_working_with_java8_part1.additional_tasks.patterns.strategy.strategies.StartBusiness;

/**
 * Task:
 *
 * Implement an example of a strategy pattern (we discussed this pattern when we looked at examples of polymorphism).
 */

public class Runner {

    private static EarningsStrategy strategy1 = new StartBusiness();
    private static EarningsStrategy strategy2 = new GetJob();
    private static EarningsStrategy strategy3 = new InvestInCryptocurrency();

    public static void main(String[] args) {
        EarningsContext context = new EarningsContext();
        context.setStrategy(strategy2);
        context.makeMoney();
    }
}
