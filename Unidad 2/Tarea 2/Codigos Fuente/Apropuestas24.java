/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apropuestas2.pkg4;

import java.util.Scanner;

/**
 *
 * @author 1dawsemia
 */
/*
Realiza un programa que informe al usuario (mostrando true) si un primer número es multiplo 
de otro número. Ambos números se piden por teclado 
*/
public class Apropuestas24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        boolean esMultiplo;
        //solicitar los números
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        num1 = sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        num2 = sc.nextInt();
        //guardamos en esMultiplo true si true si el primer número es multiplo del segundo y false si no lo es
        esMultiplo = num1 % num2 == 0;
        //Imprimir en pantalla
        System.out.println("El primer número es multiplo del segundo número: " + esMultiplo);
    }
}
