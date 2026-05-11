package com.pluralsight;

public class ShowDownApp {

    public static void main(String[] args) {

        Person somePerson = new Person("eric", 0, 100);
        SuperHero someSuperHero = new SuperHero("Super Eric", 150, 200);
        SuperVillian someVillian = new SuperVillian("Evil Lovi", 500, 1000);

        //print out some info about each Person
        System.out.println(somePerson.getStatus());
        System.out.println(someSuperHero.getStatus());
        System.out.println(someVillian.getStatus());


    }

}
