import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Hud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hud extends Actor
{
       GreenfootImage imagen;
       int cont;
       String mensaje;
       
    public Hud(int c,String msj)
    {
        cont=c;
        mensaje=msj;
        imagen=new GreenfootImage(250,150);
        imagen.setColor(new Color(200,200,0,255));
        //imagen.setFont(new Font("Verdana",Font.BOLD,24));
        dibuja();
    }
    
       public void dibuja()
   {
    imagen.clear();
    imagen.drawString(mensaje+cont,20,20);
    setImage(imagen);   
   }
   
       public void incrementar()
   {
       cont++;
       dibuja();
   }
    
      public void decrementar()
   {
       cont--;
       dibuja();
   } 
        
      public int obtenerValor()
   {
       return cont;
   }     
      
    
    
    
    
    
    /**
     * Act - do whatever the Hud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
