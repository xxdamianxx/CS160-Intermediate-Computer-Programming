/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charactergenerator;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class GoodGuyObject extends MoveableObject {
     private int strength, intelligence;
    private ArrayList<CollectableObject> backPack;

    public GoodGuyObject(int strength, int intelligence, ArrayList<CollectableObject> backPack, String name, String location, String direction, int health, int speed) {
        super(name, location, direction, health, speed);
        this.strength = strength;
        this.intelligence = intelligence;
        this.backPack = backPack;
    }

    @Override
    public String toString() {
        String goodguy =  "GoodGuy{" + "strength=" + strength + ", intelligence=" + intelligence + "," +  "backpack=";
       for (CollectableObject i : backPack )
        {
            goodguy += "Item " + i.getName() + ", ";
            goodguy += "Value " + i.getValue() + ", ";
            
        }
       goodguy += " health=" + this.getHealth() + ", speed=" + this.getSpeed() + "," + '}' ;
        return goodguy;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
