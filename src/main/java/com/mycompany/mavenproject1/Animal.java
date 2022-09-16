/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 1CFGS06
 */
public class Animal {
    //ATRIBUTOS 
    String nombre;
    String raza;
    double peso;
    String sexo;
    
    //CONSTRUCTOR
    public Animal(String nombre, String raza, double peso, String sexo) {
        this.nombre=nombre;
        this.raza=raza;
        this.peso=peso;
        this.sexo=sexo;
    }
    
    //METODOS
    public void moverse() {
        System.out.println("El animal se mueve");
    }
    public void sentarse() {
        System.out.println("El animal se sienta");
    }
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", raza=" + raza +
                ", peso=" + peso +
                '}';
    }
}
