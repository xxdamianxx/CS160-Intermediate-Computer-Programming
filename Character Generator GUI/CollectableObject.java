/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charactergenerator;

/**
 *
 * @author 
 */
public class CollectableObject  extends GameObject {
     private int value;
    private type item_type;
    
    enum type {
        POTION, COIN, MAP, COMPASS, POISON, AXE, ARROW
    }
    
    public CollectableObject(String name, String location, type item_type, int value) {
        super(name, location);
        this.value = value;
        this.item_type = item_type;
    }
    
    public int getValue() {
        return value;
    }
    
    public type getItemType() {
        return item_type;
    }
    
    public void setItemType(type item_type) {
        this.item_type = item_type;
    }
    
    
    public void setValue(int value) {
        this.value = value;
    }   
    
    public String toString() {
        return "CollectableObject{" + "value = " + value + ", item =" + item_type + '}';
    }
}
