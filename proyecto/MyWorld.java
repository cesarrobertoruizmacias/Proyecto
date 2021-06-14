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
    Hud puntos;
    Hud vidas;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(Hud.class,Pez.class,Submarino.class);
        Submarino s1 = new Submarino();
        addObject(s1,50,50);
        crearPeces(9); 
        objLife = new Vida();
        puntos = new Hud(0,"Score:");
        vidas = new Hud(3,"Vidas:");
        addObject(puntos, 150, 85);
        addObject(vidas, 300, 85);
        
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
