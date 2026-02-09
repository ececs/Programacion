/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1.pkg12;

import java.util.Scanner;

/**
 *
 * @author eudal
 */
public class Tarea112 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Solicitar la entrada de un número entero y devolver la cantidad que hay que
    sumar a ese numero para que el resultado sea multyiplo de 7.
    */
    public static void main(String[] args) {
        int num, sumar;
        
        Scanner sc = new Scanner(System.in);
        
        //Solicitamos que se introduzca un número entero. 
        System.out.println("Introduzca un numero entero: ");
        num = sc.nextInt();
        
        //Calculamos cuanto hay que sumar para que sea multiplo de 7.
        sumar = (7-num%7)%7;
        
        //Mostramos por pantalla el numero a sumar para que sea multiplo de 7.
        System.out.println("A " + num + " hay que sumarle " + sumar + " para que sea multiplo de 7.");  
        
    }
    
}
