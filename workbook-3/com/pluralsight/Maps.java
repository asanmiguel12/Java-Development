package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        List<String> FranFavs = new ArrayList<>();
        FranFavs.add("Puppies");
        FranFavs.add("Daughter");
        FranFavs.add("Java");

        List<String> GabeFavs = new ArrayList<>();
        GabeFavs.add("Rocketa League");
        GabeFavs.add("Java");
        GabeFavs.add("Gambling");

        HashMap<String, List<String>> ErrbodyFavs = new HashMap<>();
        ErrbodyFavs.put("Fran", FranFavs);
        ErrbodyFavs.put("Gabe", GabeFavs);

        System.out.println(ErrbodyFavs);
        System.out.println(ErrbodyFavs.get("Gabe")); // can only get key?
    }
}