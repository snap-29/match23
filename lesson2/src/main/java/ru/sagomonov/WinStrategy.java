package ru.sagomonov;

import java.util.function.Function;

public class WinStrategy implements IStrategy {
    @Override
    public Integer apply(Integer n) {
        if (!test(n)) {
            throw new IllegalArgumentException("n must be 2 or 3");
        }

        return n - 1;
    }

    @Override
    public boolean test(Integer n) {
        return n == 3 || n == 2;
    }
}
