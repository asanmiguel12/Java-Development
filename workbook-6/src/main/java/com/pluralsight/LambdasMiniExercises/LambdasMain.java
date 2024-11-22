package com.pluralsight.LambdasMiniExercises;

public class LambdasMain {
    public static void main(String[] args) {
//        Tester operate = new Tester() {
//            @Override
//            public void operate() {
//
//            }
//        };
        NumericOperator add = (a, b) -> System.out.println(a + b) ;
        add.operate(12, 12);

        NumericOperator max = (a, b) -> System.out.println(Math.max(a, b));
        max.operate(12, 24);

        StringFormatter toUpperCase = (a) -> System.out.println(a.toUpperCase());
        toUpperCase.format("hi");
    }
}
