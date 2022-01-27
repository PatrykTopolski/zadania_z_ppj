package com.company.task10;

public class Jam {
    private String taste;
    private double weight;

    public Jam(String taste, double weight) {
        this.taste = taste;
        this.weight = weight;
    }

    public Jam(double weight) {
        this("No name", weight);
    }

    public Jam(String taste) {
        this(taste, -100D);
    }


    public static void main(String[] args) {
        Jam jam1 = new Jam("good" , 50D);
        Jam jam2 = new Jam("good");
        Jam jam3 = new Jam(50);
    }
}
