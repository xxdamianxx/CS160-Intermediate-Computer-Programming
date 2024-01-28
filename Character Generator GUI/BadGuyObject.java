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
public class BadGuyObject extends MoveableObject{
    
    private int meanFactor, defeatPoints;

    public BadGuyObject(int meanFactor, int defeatPoints, String name, String location, String direction, int health, int speed) {
        super(name, location, direction, health, speed);
        this.meanFactor = meanFactor;
        this.defeatPoints = defeatPoints;
    }
    
    public int getMeanFactor() {
        return meanFactor;
    }

    public void setMeanFactor(int meanFactor) {
        this.meanFactor = meanFactor;
    }

    public int getDefeatPoints() {
        return defeatPoints;
    }

    public void setDefeatPoints(int defeatPoints) {
        this.defeatPoints = defeatPoints;
    }
    
    
    
}
