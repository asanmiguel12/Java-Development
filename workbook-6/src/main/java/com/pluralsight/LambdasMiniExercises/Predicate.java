package com.pluralsight.LambdasMiniExercises;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
