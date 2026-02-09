/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1.pkg21;

import java.util.Scanner;

/**
 *
 * @author eudal
 */
public class Tarea121 {

    /**
     * @param args the command line arguments
     */
    /*
    Pide dos numeros a y b. Muestra True si son iguales y False si son distintos.
    */
    public static void main(String[] args) {
        float a,b;
        
        //Solcita por pantalla la entrada de los numeros a y b
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        a = sc.nextFloat();
        System.out.println("Introduzca el segundo número: ");
        b = sc.nextFloat();
        
        //Compara los numeros y devuelve por pantalla true si son igualkes y 
        //false si son distintos
        System.out.println("Los números son iguales? " + (a == b ? true : false) );
    }
    
}
