package com.pluralsight;

public class Doggy {
    String name;
    String breed;
    String sound;
    String bark;

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
        System.out.println(Bobby);
        Bobby.bark();
        Bobby.walk("Adrian");
    }
}
