import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel3 extends World
{

    /**
     * Constructor for objects of class Nivel2.
     * 
     */
    public Vida objLife;
    Hud puntos;
    Hud vidas;
    Hud vidaMega;

    public Nivel3()
    {    
        super(600, 400, 1); 
        setPaintOrder(Hud.class,Tiburon.class,Submarino.class);
        Submarino s1 = new Submarino();
        addObject(s1,50,50);
        crearMegalodon(1); 
        objLife = new Vida();
        puntos = new Hud(15,"Score:");
        vidas = new Hud(3,"Vidas:");
        vidaMega = new Hud(985, "Vida Megalodon: ");
        addObject(puntos, 150, 85);
        addObject(vidas, 300, 85);
        addObject(vidaMega,450, 85);

    }
    public void crearMegalodon(int numero){
        for(int i=0; i <numero;i++){
            Megalodon megalodon = new Megalodon();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(megalodon,x,y);
        }
    }

    public void act(){
        if(Greenfoot.isKeyDown("S"))
        {
            Greenfoot.setWorld(new Resultados());
        }

    }
}
