package ru.sagomonov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class RandomStrategyTest {
    RandomStrategy randomStrategy = new RandomStrategy();

    @Test
    void apply() {


        for( int i=0;i<1000; i++) {
            Integer r = randomStrategy.apply(10);
            Assertions.assertTrue(r>=1 && r<=3);
        }
    }

    @Test()
    void applyFail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> randomStrategy.apply(3));
    }
}