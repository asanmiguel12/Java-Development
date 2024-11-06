package com.pluralsight.CustomCollections;

public class Box<T>{
    private T content;
    private double storageCapacity;

    public Object getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

}
