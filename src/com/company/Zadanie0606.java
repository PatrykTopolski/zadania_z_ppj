package com.company;

public class Zadanie0606 {

    public static void main(String[] args) {
	// write your code here

        int[] arr = {153,333,370,407,80};

        for (int number: arr
             ) {
            int temp = number;
            int digitsCount = 0;
            while(temp!=0){
                int cyfra = temp%10;
                temp /= 10;
                digitsCount++;

                System.out.print(cyfra);
            }
            System.out.println();
            temp = number;
            int sum = 0;
            for (int i = 0; i < digitsCount; i++) {
                sum += Math.pow(temp%10, digitsCount);
                temp /= 10;
            }
            System.out.println(sum == number ? "ta liczba jest narcystyczna " + number + " " + sum : "ta liczba nie jest narcystyczna" + number+ " " + sum);


        }

    }
}
