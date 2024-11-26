package com.pluralsight.Sakila;

public class Actor {
    private String firstName;
    private String lastname;
    private int id;

    public Actor(String firstName, String lastname, int id) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                '}';
    }
}

