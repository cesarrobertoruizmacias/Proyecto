import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    Flecha flecha = new Flecha();
    private int option=0;
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
        addObject(flecha,143,110);
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("UP") && option!=0) {option--;}
        if(Greenfoot.isKeyDown("DOWN") && option!=2) {option++;}
        
        if(option<0 && option==0) {option=0;}
        if(option>1 && option==2) {option=2;}
        if(option>0 && option<2)  {option=1;}
        
        
        flecha.setLocation(143,110 +(option*100));
        
        if(Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
        switch(option){
            case 0:
            Greenfoot.setWorld(new MyWorld());
            break;
            case 1:
            Greenfoot.setWorld(new MyWorldScore());
            break;
            case 2:
             Greenfoot.setWorld(new MyWorldControl());
            break; 
        }
     } 

  }
}