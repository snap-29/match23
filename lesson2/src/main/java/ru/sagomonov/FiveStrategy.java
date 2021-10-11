package ru.sagomonov;

import java.util.function.Function;

public class FiveStrategy implements IStrategy {
    @Override
    public Integer apply(Integer n) {

        if (!test(n)) {
            throw new IllegalArgumentException();
        }

        return n%5;
    }

    @Override
    public boolean test(Integer n) {
        int n5= n%5;

        return n5>=1 && n5<=3;
    }
}
