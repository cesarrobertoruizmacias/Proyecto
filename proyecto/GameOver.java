import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    private String scoreNumero = "";
    Hud score;

    public GameOver()
    {    
        super(600, 400, 1);
        addObject(new Back(),31,370);
        score = new Hud(0,"Score:");
        addObject(score, 390, 550);
        
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