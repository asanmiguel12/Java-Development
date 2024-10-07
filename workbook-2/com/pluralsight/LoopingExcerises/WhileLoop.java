package com.pluralsight.LoopingExcerises;

public class WhileLoop {
    public static void main(String[] args) {
        String p = "I love java";
        int y = 0;
        while (y < 5) {
            System.out.println(p);
            y++;
        }
        String r = "I love java";
        int t = 0;
        do {
            System.out.println(r);
            t++;
        }
        while (t < 5);

    }
}
