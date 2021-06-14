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
    
          Actor Pez=getOneObjectAtOffset(0,0,Pez.class);
        Submarino boss=(Submarino)getOneIntersectingObject(Submarino.class);
        if(Pez!=null){
            
            MyWorld myworld=(MyWorld)getWorld();
            //System.out.println(myworld.puntos.obtenerValor()%10 + "puntos");
            myworld.puntos.incrementar();
            //myworld.crearPeces(1);
            getWorld().removeObject(Pez);
            if(myworld.puntos.obtenerValor()%10==9)
            {
              Greenfoot.setWorld(new Menu());
            }
             
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
