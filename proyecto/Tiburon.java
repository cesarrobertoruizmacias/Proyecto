import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pez here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tiburon extends Actor
{
    /**
     * Act - do whatever the pez wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act() 
    {
        move(4);
        World m=getWorld();
        if(getX()>=m.getWidth()-5||getX()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
                turn(Greenfoot.getRandomNumber(90-45));
    }
}
if(getY()>=m.getHeight()-5||getY()<=5){
    turn(180);
    if(Greenfoot.getRandomNumber(100)<90){
        turn(Greenfoot.getRandomNumber(90-45));
    }

}

    Actor Submarino =getOneObjectAtOffset(0,0,Submarino.class);
    if(Submarino!=null){
        Nivel2 N2 = (Nivel2)getWorld();
        getWorld().removeObject(Submarino);
        N2.vidas.decrementar();
        getWorld().addObject(new Submarino(),50,300);
        if(N2.vidas.obtenerValor()==0){
        Greenfoot.setWorld(new GameOver());    
        }
    }
}
}   