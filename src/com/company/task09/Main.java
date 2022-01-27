package com.company.task09;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.birthDay = 30;
        person.name = "Jhon";
        person.surname = "Smith";

        Donkey donkey = new Donkey();
        while (!donkey.isFlying()){
            donkey.addBaloon(new Baloon());
            if (donkey.isFlying())
                System.out.println("Ja latam!!! \n baloons used: " +donkey.baloons.length );
        }

    }

}
