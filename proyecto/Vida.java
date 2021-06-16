import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lifes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vida extends Actor
{
    /**
     * Act - do whatever the lifes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter=3;
    public Vida(){
    }

    public void Disminuir()
    {
        counter--;
        if(counter==0)
        {
            Greenfoot.setWorld(new GameOver());
        }

    }    
}
