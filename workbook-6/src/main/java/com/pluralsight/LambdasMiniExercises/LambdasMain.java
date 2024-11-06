package com.pluralsight.LambdasMiniExercises;

public class LambdasMain {
    public static void main(String[] args) {
//        Tester operate = new Tester() {
//            @Override
//            public void operate() {
//
//            }
//        };
        NumericOperator test1 = (a, b) -> System.out.println(a + b) ;
        test1.operate(12, 12);

        NumericOperator test2 = (a, b) -> System.out.println(Math.max(a, b));
        test2.operate(12, 24);

        StringFormatter test3 = (a) -> System.out.println(a.toUpperCase());
        test3.format("hi");
    }
}
