package ru.sagomonov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BotStrategyTest {

    BotStrategy botStrategy = new BotStrategy();

    @Test
    void apply() {
        for (int j = 0; j < 1000; j++)
            for (int i = 23; i > 1; i--) {
                System.out.println(i);
                int nBot = botStrategy.apply(i);
                System.out.println(nBot);
                Assertions.assertTrue(nBot >= 1 && nBot <= 3);
            }
    }
}