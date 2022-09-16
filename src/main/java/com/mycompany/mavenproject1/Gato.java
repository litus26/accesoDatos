/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 1CFGS06
 */
public class Gato extends Animal {
    
    public Gato(String nombre, String raza, double peso, String sexo) {
        super(nombre, raza, peso, sexo);
    }
    
    public void maullar() {
        System.out.println("Miau");
    }
    
}
