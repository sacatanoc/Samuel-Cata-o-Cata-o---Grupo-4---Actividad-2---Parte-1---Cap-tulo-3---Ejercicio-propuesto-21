/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parte_1_problema_3.java;
import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Samuel Cataño C
 */
public class Parte_1_Capitulo_3_Ejercicio_propuesto_numero_21 {

    public static void main(String[] args) {
        
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Por favor ingrese la longitud del primer lado del triángulo:");
        double ladoA = lector.nextDouble();
        System.out.println("Por favor ingrese la longitud del segundo lado del triángulo:");
        double ladoB = lector.nextDouble();
        System.out.println("Por favor ingrese la longitud del tercer lado del triángulo:");
        double ladoC = lector.nextDouble();
        
        Triangulo triangulo_1 = new Triangulo(ladoA,ladoB,ladoC);
        
        System.out.println("Perímetro: "+triangulo_1.perimetro);
        System.out.println("Semíperimetro: "+triangulo_1.semiperimetro);
        System.out.println("Área: "+triangulo_1.area);
    }
}
