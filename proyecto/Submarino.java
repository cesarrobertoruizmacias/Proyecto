    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    public class Submarino extends Actor
    {
        public static final int UP=0;
        public static final int DOWN=1;
        public static final int LEFT=2;
        public static final int RIGHT=3;
        int direccionDisparo=2;
        boolean disparo=false;
    
        public void Submarino(){
        }
    
        public void act() 
        {
            if(Greenfoot.isKeyDown("up"))
            {
                setDireccion(UP);
                direccionDisparo=0;
            }
    
            if(Greenfoot.isKeyDown("down"))
            {
                setDireccion(DOWN);
                direccionDisparo=1;
            }
    
            if(Greenfoot.isKeyDown("left"))
            {
                setDireccion(LEFT);
                direccionDisparo=3;
            }
    
            if(Greenfoot.isKeyDown("right"))
            {
                setDireccion(RIGHT);
                direccionDisparo=2;
            }
            setShot(direccionDisparo);
        }   
    
        public void setShot(int direction){
            if(disparo && Greenfoot.isKeyDown("X"))
            {
                Disparo s1 = new Disparo(direction);
                getWorld().addObject(s1,getX(),getY());
                disparo=false;
            }
            if(!disparo && !Greenfoot.isKeyDown("X"))
            {
                disparo = true;   
            }
        }
    
        public void setDireccion(int direccion)
        {
            int i= 5;
            switch(direccion){
                case UP:
                setRotation(0);
                if(Greenfoot.isKeyDown("space")){
                    setLocation(getX(),getY()-i);
                }
                else{
                    setLocation(getX(),getY()-i);
                }
                break;
                case DOWN:
                setRotation(0);
                if(Greenfoot.isKeyDown("space")){
                    setLocation(getX(),getY()+i);
                }else{
                    setLocation(getX(), getY()+i);
                }
                break;
                case LEFT:
                setRotation(0);
                if(Greenfoot.isKeyDown("space")){
                    setLocation(getX()+i,getY());
                }else{
                    setLocation(getX()-i,getY());
                }
                break;
                case RIGHT:
                setRotation(0);
                if(Greenfoot.isKeyDown("space")){
                    setLocation(getX()+i, getY());
                }
                else
                {
                    setLocation(getX()+i,getY());
                }
                break;
            }
    
        }
    }
