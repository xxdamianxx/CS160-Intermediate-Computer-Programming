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
public class GameObject {
     String name, location;
    
    GameObject(String name, String location)
    {
        this.name = name;
        this.location = location; 
    }
    
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    
    public String getLocation()
    {
        return location;
    }
    
    public void setLocation(String location)
    {
        this.location = location;
    }
    
    public String toString()
    {
        return "GameObject{ " + "name = " + name  + " , " + "location = " + location + "}";
    }
}
