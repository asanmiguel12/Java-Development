package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Doggy {
    String name;
    String breed;
    String sound;
    String bark;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Doggy(String name, String breed, String sound) {
        this.name = name;
        this.breed = breed;
        this.sound = sound;
    }

    public void bark() {
        System.out.println(name + " says " + sound);
    }

    public void walk(String person) {
        System.out.println(person + " walks " + name);
    }
    //Overload
    public void walk(List<String> people) {
        for (String name: people) {
        System.out.println(people + " walks " + getName());
    }
    }

    @Override
    public String toString() {
        return "Doggy{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", sound='" + sound + '\'' +
                ", bark='" + bark + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Doggy Bobby = new Doggy("Bobby", "Pit bull", "wafwafwafwafwaf");
        System.out.println(Bobby.getSound());
        Bobby.bark();
        Bobby.walk("Adrian");
        List<String> people = new ArrayList<>();
        Collections.addAll(people, "Gabe", "Bryan");
        Bobby.walk(people.getFirst());

    }
}
