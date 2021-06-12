import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepararMundo();
    }
    
    private void prepararMundo(){
        addObject(new Jugar(),310,110);
        addObject(new Score(),310,210);
        addObject(new Control(),310,310);
    }
    
    public void act()
    {
        
    }

  }
