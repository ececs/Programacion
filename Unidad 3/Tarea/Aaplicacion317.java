/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion3.pkg17;

import java.util.Scanner;

/**
 *
 * @author daldo
 */
/*
Para dos números dados, a y b, es posible buscar el máximo común divisor (el número
más grande que divide a ambos) mediante un algoritmo ineficiente pero sencillo: desde
el menor de a y b, ir buscando, de forma decreciente, el primer número que divide a am-
bos simultáneamente. Realiza un programa que calcule el máximo común divisor de dos
números.
*/
public class Aaplicacion317 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, menor;
        int mcd = 0;
        //introducir los números a y b
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzaca el número a: ");
        a=sc.nextInt();
        System.out.println("Introduzaca el número b: ");
        b=sc.nextInt();
        menor = a <= b ? a : b;//guardamos en la variable menor el menor de a y b
        for (int i = menor; i > 1; i--){//bucle que recorre desde el menor de a y b hasta 2
            if (a % i == 0 && b % i == 0){//si a y b son disvisibles por i 
                mcd = i;//i es el máximo común divisor
                //imprimir en pantalla el mcd
                System.out.println("El máximo comán divisor de a y b es: " + mcd);
                break;//salir del bucle ya se encontro el mcd
            }    
        }
        if (mcd == 0){//si mcd se quedo en 0 no hay mcd mayor que 1 y se imprime en pantalla
        System.out.println("No existe máximo común divisor de a y b mayor que 1");
        }

    }
    
}
