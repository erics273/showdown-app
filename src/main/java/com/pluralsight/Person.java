package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Person {

    //things that describe a person for this application
    protected String name;
    protected int health;
    protected int experiencePoints;

    //create hashmap for battle log
    private HashMap<String, Integer> battleLog = new HashMap<String, Integer>();
    //create HashMap for inventory
    private HashMap<String, Integer> inventory = new HashMap<String, Integer>();

    public Person(String name, int health, int experiencePoints) {
        this.name = name;
        this.health = health;
        this.experiencePoints = experiencePoints;
    }

    //interesting methods
    public boolean isAlive(){
        //return true if health is more than 0 and false if less or =
        return this.health > 0;
    }

    public String getStatus(){
        return this.name + " has " + this.health + " health";
    }

    public void takeDamage(int amount){
        //reduce the health by the amount of damage
        this.health -= amount;
        if(this.health < 0 ) health = 0;
    }

    public void fight(Person opponent){
        System.out.println(this.getName() + " prepares to fight " + opponent.getName());
    }

    //update the log entry for our SuperPerson
    public void logHit(Person opponent) {
        String name = opponent.name;
        int count = battleLog.getOrDefault(name, 0);
        battleLog.put(name, count + 1);
    }

    public void printBattleLog() {
        System.out.println("Battle log for " + name + ":");
        for (HashMap.Entry<String, Integer> entry : battleLog.entrySet()) {
            System.out.println(" - Hit " + entry.getKey() + ": " + entry.getValue() + " times");
        }
    }

    //add items to my inventory
    public void addPowerUp(String name, int value){
        inventory.put(name, value);
    }

    public int getPowerUpBonus(String name){

        //bonus damage has to start at something
        int bonusDamage = 0;

        //return the 0 bonus damage if we don't have that item
        if(!inventory.containsKey(name)){
            System.out.println(name + " does not exist in your inventory, 0 bonus damage");
            return bonusDamage;
        }

        //get the items damage
        bonusDamage = inventory.get(name);

        //print out what item we got
        System.out.println("The " + name + " has been equipped and will do " + bonusDamage + " extra damage");

        //return the damage modifier
        return bonusDamage;

    }

    public int getPowerUpBonusRandom(){
        int bonusDamage = 0;

        if (!inventory.isEmpty()) {
            //create a new list of just the keys from the HashMap (glove, hammer, etc....)
            ArrayList<String> items = new ArrayList<String>(inventory.keySet());

            //get a random item name from the above list we just made and store it in randomItem
            String randomItem = items.get(new Random().nextInt(items.size()));

            //get the point value for that item from the inventory HashMap
            //bonuse would be the int that represents the damage the item will do.
            bonusDamage = inventory.get(randomItem);

            System.out.println("The " + randomItem + " has been equipped and will do " + bonusDamage + " extra damage");

        }else{
            System.out.println("no items exist in your inventory, 0 bonus damage");
        }

        return bonusDamage;
    }

    //getters and setters
    //out of the way because the are not interesting
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    protected int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }
}
