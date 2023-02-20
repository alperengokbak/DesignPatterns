/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;

/**
 *
 * @author aybuke.kececi
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dot p = new Dot(0, 0, 0, "1");
        System.out.println(p);
        
        Shape kare = new Square("2D", "kare", p, 3);
        Shape daire = new Circle(3, "2D", "daire", p);
        Shape dikdörtgen = new Rectangle("2D", "dikdörtgen", p, 2, 5);
        
        ArrayList<Shape> sekiller = new ArrayList<>();
        sekiller.add(kare);
        sekiller.add(dikdörtgen);
        sekiller.add(daire);
        
        for (int i = 0; i < sekiller.size(); i++) {
            if(sekiller.get(i) instanceof TwoDimShape){
                System.out.println("Hacimsiz -> " + sekiller.get(i).toString());
            }
        }
    }
    
}
