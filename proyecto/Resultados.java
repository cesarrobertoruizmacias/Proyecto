import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Resultados here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Resultados extends World
{
    public Resultados()
    {    
        super(600, 400, 1); 
        Greenfoot.playSound("win.mp3");
        addObject(new Back(),31,370);
    }
}
