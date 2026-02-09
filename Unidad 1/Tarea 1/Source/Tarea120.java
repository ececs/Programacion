/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1.pkg20;

import java.util.Locale;



/**
 *
 * @author eudal
 */
public class Tarea120 {

    /**
     * @param args the command line arguments
     */
    /*
    Solicita un numero real y calcula su raiz cuadrada
    */
    public static void main(String[] args) {
        float num;
        double raiz;
        
        //Solicita por pantalla la entrada de el numero.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Introduzca un numero real: ");
        num = sc.nextFloat();
        
        //Calcula la raiz cuadrada del numero introducido.
        raiz = java.lang.Math.sqrt(num);
        
        //Muestra por pantalla el resultado.
        System.out.println("La raiz cuadrada es: " + raiz);
    }
    
}
