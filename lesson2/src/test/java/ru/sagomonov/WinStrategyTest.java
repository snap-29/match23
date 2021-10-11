package ru.sagomonov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class WinStrategyTest {

    Function<Integer, Integer> stratege = new WinStrategy();

    @Test
    void apply() {
        Assertions.assertEquals(Integer.valueOf(2), stratege.apply(3));
        Assertions.assertEquals(Integer.valueOf(1), stratege.apply(2));
    }

    @Test()
    void applyFail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> stratege.apply(10));
    }
}