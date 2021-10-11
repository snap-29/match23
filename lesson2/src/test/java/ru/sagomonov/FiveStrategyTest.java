package ru.sagomonov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiveStrategyTest {

    FiveStrategy fiveStrategy = new FiveStrategy();

    @Test
    void apply() {
        Assertions.assertEquals(Integer.valueOf(3), fiveStrategy.apply(8));
    }

    @Test()
    void applyFail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> fiveStrategy.apply(9));
    }
}