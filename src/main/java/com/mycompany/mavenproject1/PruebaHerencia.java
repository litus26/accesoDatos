/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 1CFGS06
 */
public class PruebaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro p1 = new Perro("Coco", "Bulldog frances", 12, "Macho");
        Gato g1 = new Gato("Canela", "Siames", 4.5, "Hembra");
        
        p1.moverse();
        p1.ladrar();
        
        System.out.println(g1);
        g1.maullar();
        
        System.out.println(p1);
    }
    
}
