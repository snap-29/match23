package ru.sagomonov;

import java.security.SecureRandom;
import java.util.Random;
import java.util.function.Supplier;

public class Generator123 implements Supplier<Integer> {
    final int n;
    final Random random = new SecureRandom();

    public Generator123() {
        this(3);
    }
    /**
     *
     * @param n - максимальное число спичек, которые можно взять за 1 ход
     **/
    public Generator123(int n) {
        this.n = n;
    }

    @Override
    public Integer get() {
        return random.nextInt(n) + 1;
    }
}
