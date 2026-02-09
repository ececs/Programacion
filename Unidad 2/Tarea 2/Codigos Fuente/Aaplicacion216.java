/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion2.pkg16;

import java.util.Scanner;

/**
 *
 * @author eudal
 */
/*
Utiliza el operador ternario para calcular el valor absoluto de un número que se solicita al 
usuario
*/
public class Aaplicacion216 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num;
        //Solicitar el número
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        num = sc.nextDouble();
        //Utilizar el operador ternario. Si el número es menor que 0 multiplicar por -1
        num = num < 0 ? (-1 * num) : num;
        //Imprimir en pantalla el valor aboluto del número.
        System.out.println("El valor absoluto del número introducido es: " + num);
    }
    
}
