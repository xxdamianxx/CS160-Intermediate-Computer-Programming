/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roleplayinggame;

/**
 *
 * @author 
 */
public class StationaryObject extends GameObject {
    private int damagePoints;
    
    public StationaryObject(String name, String location, int damagePoints)
    {
        super(name,location);
        this.damagePoints = damagePoints;
    }
    
    public String toString()
    {
        return "StationaryObject{" + "damagePoints=" + damagePoints + '}';
    }
    
    public int getDamagePoints() {
        return damagePoints;
    }

    
    
}
