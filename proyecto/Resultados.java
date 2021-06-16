import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a description of class Resultados here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Resultados extends World
{
    private String scoreNumero = "";
    public Resultados()
    {    
        super(600, 400, 1); 
        Greenfoot.playSound("win.mp3");
        addObject(new Back(),31,370);
        try{
            FileReader lector = new FileReader ("C:\\Users\\edwin\\Desktop\\Proyecto\\proyecto\\prueba.txt");
            BufferedReader BR = new BufferedReader(lector);
            scoreNumero = BR.readLine();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Score: " + scoreNumero);
    }
}