package com.company.task10;

public class FruitTree extends DeciduousTree{
    protected String fruitName;

    public FruitTree(boolean alwaysGreen, int height, String crossSection, int leavesShape, String fruitName) {
        super(alwaysGreen, height, crossSection, leavesShape);
        this.fruitName = fruitName;
    }

    @Override
    public String toString() {
        return "FruitTree{" +
                "leavesShape=" + leavesShape +
                ", fruitName='" + fruitName + '\'' +
                ", alwaysGreen=" + alwaysGreen +
                ", height=" + height +
                ", crossSection='" + crossSection + '\'' +
                '}';
    }
}
