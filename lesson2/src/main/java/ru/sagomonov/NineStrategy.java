package ru.sagomonov;

public class NineStrategy implements IStrategy {

    @Override
    public Integer apply(Integer n) {
        if(!test(n))
            throw new IllegalArgumentException();

        return (n-5)%4;
    }

    @Override
    public boolean test(Integer n) {
        return n>5 && (n-5)%4!=0;
    }
}
