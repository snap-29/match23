package ru.sagomonov;

import java.util.function.Function;
import java.util.function.Supplier;

public class RandomStrategy implements IStrategy {
    final Supplier<Integer> supplier;

    public RandomStrategy() {
        this(new Generator123());
    }

    public RandomStrategy(Supplier<Integer> supplier) {
        this.supplier = supplier;
    }

    @Override
    public Integer apply(Integer n) {
        if(!test(n)){
            throw new IllegalArgumentException("n must be more than 3");
        }
        return supplier.get();
    }

    @Override
    public boolean test(Integer n) {
        return n>3;
    }
}
