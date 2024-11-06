package com.pluralsight.CustomCollections;

public class Tester <T, U> {
    private T food;
    private U clothes;

    public Tester(T food, U clothes) {
        this.food = food;
        this.clothes = clothes;
    }

    public T getFood() {
        return food;
    }

    public void setFood(T food) {
        this.food = food;
    }

    public U getClothes() {
        return clothes;
    }

    public void setClothes(U clothes) {
        this.clothes = clothes;
    }

    public void printT(){
        System.out.println(this.food);
    }

    public void printU(){
        System.out.println(this.clothes);
    }
}
