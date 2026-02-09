/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion4.pkg13;

import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion413 {

    /**
     * @param args the command line arguments
     */
    /*
    Crea la función muestraPares (int n) que muestre por consola los primeros n números
    pares.
    */
    public static void main(String[] args) {
        int n;
        //solicitamos se introduzca la cantidad de número pares a generar
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de números pares a generar: ");
        n = sc.nextInt();
        muestraPares(n);//llamada a la funcion imprime los n primeros números pares
    }
    
    static void muestraPares(int n){
        for (int i=1; i <= n; i++){//bucle de 1 a n 
            if ( i % 2 == 0){//si el número es par
            System.out.print(" " + i + " ");//imprimir el número en pantalla
            }
        }
    }
    
}
