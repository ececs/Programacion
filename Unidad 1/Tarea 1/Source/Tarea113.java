/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1.pkg13;

import java.util.Scanner;

/**
 *
 * @author eudal
 */
public class Tarea113 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Modificar la aplicación de la tarea 1.12 para que , indicando dos números n y m 
    enteros, devuelva cuanto hay que sumar a n para que sea multiplo de m.
    */
    public static void main(String[] args) {
        int n, m, num, sumar;
        
        //Creamos un Objeto Scanner y solicitamos que se introduzca n
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entero: ");
        n = sc.nextInt();
        //Solicitamos que se introduzca m
        
        System.out.println("Introduzca un numero entero: ");
        m = sc.nextInt();
        //Modificamos los calculos de la tarea 1.12 sustituyendo 7 por m
        
        sumar = ( m - n % m) % m;
        //Mostramos por pantalla cuanto hay que sumar a n para que sea multiplo de m
        
        System.out.println("A " + n + " hay que sumarle " + sumar + " para que sea multiplo de " + m + ".");  
    }
    
}
