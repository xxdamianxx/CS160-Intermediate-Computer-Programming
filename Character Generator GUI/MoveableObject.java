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
public class MoveableObject extends GameObject {
    private int health, speed;
    private String direction;
    
    public MoveableObject(String name, String location, String direction, int health, int speed)
    {
        super(name, location);
        this.direction = direction;
        this.health = health;
        this.speed = speed;
    }
    
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    
    public String fight()
    {
        String status = "I am fighting!";
        return status;
    }
}
