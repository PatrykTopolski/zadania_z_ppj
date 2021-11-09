package com.company;

public class Zadanie0607 {


    public static void main(String[] args) {
        int[] tab = {1,2,3,4,1,2,3,4};
        boolean areNumbersDuplicated = true;
        for (int pointer1 = 0; pointer1 < tab.length; pointer1++) {
            int point1Occurrences = 0;
            for (int pointer2 = -0; pointer2 <tab.length ; pointer2++) {
                if(tab[pointer1] == tab[pointer2]){
                    point1Occurrences++;
                }
            }
            if(point1Occurrences <2){
                areNumbersDuplicated = false;
            }
        }

        System.out.println(areNumbersDuplicated);


    }

}
