package com.pluralsight.CustomCollections;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items = new ArrayList<>();
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
    }

    public void add(T item) {
       if(items.size() < this.maxSize) {
           items.add(item);
       } else {
        System.out.println("Exceeding maxsize! Cannot add");
    }
}

    public List<T> getItems() {
        return  List.copyOf(items);
    }
}
