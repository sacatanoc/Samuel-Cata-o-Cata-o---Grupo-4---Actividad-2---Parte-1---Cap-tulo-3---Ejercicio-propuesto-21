/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte_1_problema_3.java;

/**
 *
 * @author Samuel Cataño C
 */
public class Triangulo {
    
    double ladoA;
    double ladoB;
    double ladoC;
    double perimetro;
    double semiperimetro;
    double area;
    
    public Triangulo(double ladoA, double ladoB, double ladoC){
    
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.perimetro = Math.floor(100*(ladoA+ladoB+ladoC)+0.5)/100;
        this.semiperimetro = Math.floor(100*((ladoA+ladoB+ladoC)/2)+0.5)/100;
        this.area = Math.floor(100*(Math.sqrt(this.semiperimetro*(this.semiperimetro-ladoA)*(this.semiperimetro-ladoB)*(this.semiperimetro-ladoC)))+0.5)/100;
    
    }
    
}
