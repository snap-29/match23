package ru.sagomonov;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class BotStrategy implements IStrategy {

    final List<IStrategy> list = Arrays.asList(new WinStrategy(), new NineStrategy(),new FiveStrategy(), new RandomStrategy());

    @Override
    public Integer apply(Integer n) {
        if(!test(n))
            throw new IllegalArgumentException("n must be more than 1");

        for (IStrategy strategy: list) {
            if (strategy.test(n)){
                System.out.println(strategy.getClass().getName());
                return strategy.apply(n);
            }
        }


        throw new IllegalStateException();
    }

    @Override
    public boolean test(Integer n) {
        return n>1;
    }
}
