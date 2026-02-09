/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1.pkg14;

import java.util.Scanner;

/**
 *
 * @author eudal
 */
public class Tarea114 {

    /**
     * @param args the command line arguments
     */
    /*
    Programa que pida base y altura de un triángulo y devuelva su área.
    */
    public static void main(String[] args) {
        double base, altura, area;
        
        //Creamos un objetos Scanner y solicitamos que la base del triángulo
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base del triangulo: ");
        base = sc.nextInt();
        
        //Solicitamos la altura del triángulo
        System.out.println("Introduzca la altura del triangulo: ");
        altura = sc.nextInt();
        
        //Calculamos el área
        area = base * altura / 2;
        
        //Devolvemos el área del triángulo
        System.out.println("El área del triangulo es = " + area);
    }
    
}
