package com.pluralsight;

public class ShowdownApp {

    public static void main(String[] args) {

        //create a super person
//        SuperPerson superPerson = new SuperPerson();
//        //set the super persons attributes user the setters
//        superPerson.setName("Super Kimball");
//        superPerson.setHealth(100);
//        superPerson.setExperiencePoints(25);

        //its better to create heroes and villian. thats just more fun
        SuperHero superHero = new SuperHero();
        superHero.setName("Super Kimball");
        superHero.setHealth(100);
        superHero.setExperiencePoints(25);

        SuperVillian superVillian = new SuperVillian();
        superVillian.setName("Evil Elman");
        superVillian.setHealth(100);
        superVillian.setExperiencePoints(75);

        //how are the super things feeling
        System.out.println(superHero.getStatus());
        System.out.println(superVillian.getStatus());


        //make the super things interact
        superHero.fight(superVillian);
        superVillian.takeDamage(15);
        superHero.takeDamage(25);

        //how are the super things feeling
        System.out.println(superHero.getStatus());
        System.out.println(superVillian.getStatus());



    }

}
