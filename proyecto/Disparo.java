import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo extends Actor
{

    private int arregloImagen=1;
    private int velocidadDisparo=6;
    private int position;
    private int vidaMega = 0;

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
            Nivel1 nivel1=(Nivel1)getWorld();
            nivel1.puntos.incrementar();
            getWorld().removeObject(Pez);
            if(nivel1.puntos.obtenerValor()%10==9)
            {
                Greenfoot.setWorld(new Nivel2());
            }
        }

        Actor Tiburon=getOneObjectAtOffset(0,0,Tiburon.class);
        if(Tiburon!=null){            
            Nivel2 nivel2=(Nivel2)getWorld();
            getWorld().removeObject(Tiburon);
            nivel2.puntos.incrementar();
            if(nivel2.puntos.obtenerValor()%10 == 5)
            {
                Greenfoot.setWorld(new Nivel3());
            }

        }

        Actor Megalodon=getOneObjectAtOffset(0,0,Megalodon.class);
        if(Megalodon!=null){    
            Nivel3 nivel3=(Nivel3)getWorld();

            nivel3.puntos.incrementar();

            nivel3.vidaMega.decrementar();

            if(nivel3.puntos.obtenerValor() == 1000)
            {
                getWorld().removeObject(Megalodon);
                Greenfoot.setWorld(new Resultados());
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
