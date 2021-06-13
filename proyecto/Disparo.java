import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo extends Actor
{
    
    int arregloImagen=1;
    int velocidadDisparo=6;
    int position;
        
    public Disparo(int direction) 
    {
        position = direction; 
    }  
    
    public void act(){
        setImage("misil"+arregloImagen+".png");
        switch(position){
            case 0:
                setLocation(getX(),getY()-velocidadDisparo);
            break;
            
            case 1:
                setLocation(getX(),getY()+velocidadDisparo);
            break;
            
            case 2:
                setLocation(getX()+velocidadDisparo, getY());
            break;
            
            case 3:
                setLocation(getX()-velocidadDisparo, getY());
            break;
    }
    
    if((getX()>=getWorld().getWidth()-5) || (getX()<=5)){
        getWorld().removeObject(this);
    }
    else{
        if((getY()>=getWorld().getHeight()-5)||(getY()<=5)){
            getWorld().removeObject(this);
        }
        else
        if(arregloImagen<16)
        arregloImagen++;
    }
    
}
}