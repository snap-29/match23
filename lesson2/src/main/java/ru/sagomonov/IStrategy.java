package ru.sagomonov;

import java.util.function.Function;
import java.util.function.Predicate;

public interface IStrategy extends Function<Integer, Integer>, Predicate<Integer> {
}
