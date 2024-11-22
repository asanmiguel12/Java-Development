package com.pluralsight.Finance;

import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<Valuable> valuables;

    public Portfolio(String name, String owner, ArrayList<Valuable> valuables) {
        this.name = name;
        this.owner = owner;
        this.valuables = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ArrayList<Valuable> getValuables() {
        return valuables;
    }

    public void setValuables(ArrayList<Valuable> valuables) {
        this.valuables = valuables;
    }
}
