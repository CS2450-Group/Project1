
import java.io.File;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author olove
 */
public class readFile {
    
    private Scanner x;

    public void openFile(){
        try{
            x = new Scanner(new File("scores.txt"));
        }
        catch(Exception e){
            System.out.println("no file found");
        }
    }
    
    public String[] readScore(){
        String[] scores = new String[8];
        for(int i = 0; i < scores.length; i++){
            scores[i] = x.next();
        }
        return scores;
    }
    
    public void closeFile(){
        x.close();
    }
    
}
