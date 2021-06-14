import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel2 extends World
{

    /**
     * Constructor for objects of class Nivel2.
     * 
     */
    public Vida objLife;
    Hud puntos;
    Hud vidas;
    public Nivel2()
    {    
        super(600, 400, 1); 
        setPaintOrder(Hud.class,Tiburon.class,Submarino.class);
        Submarino s1 = new Submarino();
        addObject(s1,50,50);
        crearTiburones(6); 
        objLife = new Vida();
        puntos = new Hud(9,"Score:");
        vidas = new Hud(3,"Vidas:");
        addObject(puntos, 150, 85);
        addObject(vidas, 300, 85);// Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       
        
    }
    
        public void crearTiburones(int numero){
        for(int i=0; i <numero;i++){
            Tiburon t = new Tiburon();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(t,x,y);
        }
    }
}
