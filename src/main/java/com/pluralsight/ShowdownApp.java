package com.pluralsight;

import java.util.ArrayList;
import java.util.Random;

public class ShowdownApp {

    public static void main(String[] args) {

       SuperHero hero = new SuperHero("Eric", 100, 25);
       SuperVillian villian = new SuperVillian("Jim", 100, 15);
       SuperPerson bob = new SuperPerson("Bob", 100);

       ArrayList<SuperPerson> superPeople = new ArrayList<>();
       superPeople.add(hero);
       superPeople.add(villian);
       superPeople.add(bob);

       for (SuperPerson person : superPeople) {

           if(person.getClass().getSimpleName().equals("SuperHero")){

               SuperHero theHero = (SuperHero) person;
               System.out.println(theHero.getPowerLevel());

           }else if(person.getClass().getSimpleName().equals("SuperVillian")){

               SuperVillian theVillian = (SuperVillian) person;
               System.out.println(theVillian.getEvilnessLevel());

           }else if(person instanceof SuperPerson){
               System.out.println(person.getExperiencePoints());
           }


       }



    }



}
