package com.company.task10;

public class TreesMain {

    public static void main(String[] args) {
        Tree[] trees = {new FruitTree(true, 50, Tree.CIRCULAR,5,"gruszka")
                ,new DeciduousTree(true,20, Tree.CRONE, 0)};
        for (Tree tree: trees
             ) {
            System.out.println(tree);
        }
    }
}
