package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> favSongs = new ArrayList<>();
        favSongs.add("Happy Birthday");
        favSongs.add("ABC");
        favSongs.add("Mary Had A Little Lamb");
        favSongs.add("Yo");
        favSongs.add("Lovely");

        Collections.sort(favSongs);
        favSongs.remove("Mary Had A Little Lamb");
        favSongs.remove(0);
        favSongs.remove(1);
        System.out.println("The number of songs is " + favSongs.size());
        System.out.println(favSongs);

        char a ='a';

    }
}
