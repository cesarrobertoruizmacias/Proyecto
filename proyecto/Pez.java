import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pez here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pez extends Actor
{
    /**
     * Act - do whatever the pez wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act() 
    {
        move(2);
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
        MyWorld myworld = (MyWorld)getWorld();
        getWorld().removeObject(Submarino);
        myworld.vidas.decrementar();
        getWorld().addObject(new Submarino(),50,300);
        if(myworld.vidas.obtenerValor()==0){
        Greenfoot.setWorld(new GameOver());    
        }
    }
}
}   

