/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author olove
 */
public class testmain {
    public static void main(String args[]) {

        readFile r = new readFile();

        r.openFile();
        String[] scores = r.readScore();
        System.out.println(scores[7]);
        r.closeFile();
    }
}
