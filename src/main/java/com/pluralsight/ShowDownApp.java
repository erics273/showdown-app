package com.pluralsight;

import java.util.ArrayList;

public class ShowDownApp {

    public static void main(String[] args) {

        //create a list to hold our people
        ArrayList<Person> myPeople = new ArrayList<>();

        Person somePerson = new Person("eric", 500, 100);
        SuperHero someSuperHero = new SuperHero("Super Eric", 150, 50);
        SuperVillian someVillian = new SuperVillian("Evil Lovi", 500, 65);

        myPeople.add(someVillian);
        myPeople.add(somePerson);
        myPeople.add(someSuperHero);

        for (Person person : myPeople){

            System.out.println("the person was a " + person.getClass());

            if(person instanceof SuperHero){

                SuperHero theHero = (SuperHero) person;
                System.out.println("this was a super hero " + theHero.getPowerLevel());
            }

            if(person instanceof SuperVillian){

                SuperVillian theVillan = (SuperVillian) person;
                System.out.println("this was a Villian " + theVillan.getEvilnessLevel());
            }




        }

        //print out some info about each Person
        System.out.println(somePerson.getStatus());
        System.out.println(someSuperHero.getStatus());
        System.out.println(someVillian.getStatus());
        System.out.println();

//        System.out.println(someVillian.getName() + "has been attacked");
//        someVillian.takeDamage(75);
//        System.out.println(someVillian.getStatus());

        //lets fight!
        someSuperHero.fight(someVillian);
        someVillian.fight(somePerson);
        someVillian.fight(someSuperHero);

        System.out.println();

        System.out.println(somePerson.getStatus());
        System.out.println(someSuperHero.getStatus());
        System.out.println(someVillian.getStatus());


    }

}
