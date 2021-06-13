import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Vida objLife;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Submarino s1 = new Submarino();
        addObject(s1,50,50);
        crearPeces(10); 
        objLife = new Vida();
    }
    
    public void crearPeces(int numero){
        for(int i=0; i <numero;i++){
            Pez p = new Pez();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(p,x,y);
        }
    }
}
