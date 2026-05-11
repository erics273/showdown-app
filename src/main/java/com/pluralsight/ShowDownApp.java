package com.pluralsight;

public class ShowDownApp {

    public static void main(String[] args) {

        Person somePerson = new Person("eric", 0, 100);
        SuperHero someSuperHero = new SuperHero("Super Eric", 150, 200);

        System.out.println("the person has this much experience: " + somePerson.getExperiencePoints());
        System.out.println(" the hero has this much power" + someSuperHero.getPowerLevel());

        if(somePerson.isAlive()){
            System.out.println(somePerson.getName() + " is alive");
        }else{
            System.out.println(somePerson.getName() + " is dead");
        }


        if(someSuperHero.isAlive()){
            System.out.println(someSuperHero.getName() + " lives");
        }else{
            System.out.println(someSuperHero.getName() + " has perished");
        }

    }

}
