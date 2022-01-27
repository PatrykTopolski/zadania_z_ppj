package com.company.task10;

public class DeciduousTree extends Tree{
    protected int leavesShape;

    public DeciduousTree(boolean alwaysGreen, int height, String crossSection, int leavesShape) {
        super(alwaysGreen, height, crossSection);
        this.leavesShape = leavesShape;
    }

    @Override
    public String toString() {
        return "DeciduousTree{" +
                "leavesShape=" + leavesShape +
                ", alwaysGreen=" + alwaysGreen +
                ", height=" + height +
                ", crossSection='" + crossSection + '\'' +
                '}';
    }
}
