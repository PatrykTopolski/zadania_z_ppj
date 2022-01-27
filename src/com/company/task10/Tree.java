package com.company.task10;

public class Tree {
    public static final String CRONE = "Stozkowy";
    public static final String COLUMN = "kolumnowy";
    public static final String CIRCULAR = "okaglawy";
    public static final String UMBRELLA = "parasolowaty";

    protected boolean alwaysGreen;
    protected int height;
    protected String crossSection;

    public Tree(boolean alwaysGreen, int height, String crossSection) {
        this.alwaysGreen = alwaysGreen;
        this.height = height;
        this.crossSection = crossSection;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "alwaysGreen=" + alwaysGreen +
                ", height=" + height +
                ", crossSection='" + crossSection + '\'' +
                '}';
    }
}
