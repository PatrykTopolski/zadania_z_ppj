package com.company.task10;

public class ConiferTree extends Tree{

    protected int needleQuantity;
    protected double coneLength;

    public ConiferTree(boolean alwaysGreen, int height, String crossSection, int needleQuantity, double coneLength) {
        super(alwaysGreen, height, crossSection);
        this.needleQuantity = needleQuantity;
        this.coneLength = coneLength;
    }

    @Override
    public String toString() {
        return "ConiferTree{" +
                "needleQuantity=" + needleQuantity +
                ", coneLength=" + coneLength +
                ", alwaysGreen=" + alwaysGreen +
                ", height=" + height +
                ", crossSection='" + crossSection + '\'' +
                '}';
    }
}
